import tkinter as tk
from PIL import Image, ImageTk

# Create the main window
root = tk.Tk()
root.title("RP Ngoma College")
root.geometry("600x400")

# Title
title = tk.Label(root, text="Welcome to RP Ngoma College", font=("Arial", 16))
title.pack()

# Subtitle
subtitle = tk.Label(root, text="Providing quality education and skills for the future.", font=("Arial", 12))
subtitle.pack()

# Load and display images
frame = tk.Frame(root)
frame.pack()

for img_path in ["image 1.jpg", "image2.jpg", "image3.jpg"]:
    image = Image.open(f"static/{img_path}")
    image = image.resize((150, 100))
    img = ImageTk.PhotoImage(image)
    label = tk.Label(frame, image=img)
    label.image = img
    label.pack(side="left", padx=10)

root.mainloop()
