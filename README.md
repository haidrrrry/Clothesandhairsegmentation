🎨 Clothes & Hair Segmentation App (Android - TensorFlow Lite)
This Android app performs Clothes & Hair Segmentation using the selfie_multiclass_256x256.tflite model with TensorFlow Lite. It loads an image from the assets folder, runs segmentation, and overlays the mask on the image, displaying the result in full screen.

📸 Features
✅ Clothes & Hair segmentation using TensorFlow Lite
✅ Utilizes selfie_multiclass_256x256.tflite model
✅ Full-screen segmented image display
✅ Optimized for Android devices
✅ Runs on-device without internet
🛠️ Tech Stack
Android Studio
Kotlin
Jetpack Compose
TensorFlow Lite
🚀 How It Works
The app loads an image from the assets folder.
Runs the TFLite segmentation model.
Generates a segmentation mask (hair, clothes, background).
Overlays the mask on the original image.
Displays the final result in full screen.
📁 Model Used
Model: selfie_multiclass_256x256.tflite
Input Size: 256x256
Output: Segmentation mask with multiple classes (hair, clothes, background)
📂 Getting Started
1️⃣ Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/clothes-hair-segmentation-app.git
cd clothes-hair-segmentation-app
2️⃣ Open in Android Studio
Open Android Studio
Click File → Open and select the cloned repository
3️⃣ Add Image & Model
Place your images in the assets folder (app/src/main/assets)
Ensure selfie_multiclass_256x256.tflite is in the assets folder
4️⃣ Run the App
Select a physical device or emulator
Click Run ▶️
🧑‍💻 Usage
The app will load the image from assets
Segment clothes and hair
Display the result on full screen
⭐ Contributing
Feel free to fork the repo, create a branch, and submit a Pull Request 🚀

📄 License
This project is licensed under the MIT License

