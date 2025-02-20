# 🎨 Clothes & Hair Segmentation App (Android - TensorFlow Lite)

This Android app performs Clothes & Hair Segmentation using the `selfie_multiclass_256x256.tflite` model with TensorFlow Lite. It loads an image from the assets folder, runs segmentation, and overlays the mask on the image, displaying the result in full screen.

## 📸 Features

✅ Clothes & Hair segmentation using TensorFlow Lite  
✅ Utilizes `selfie_multiclass_256x256.tflite` model  
✅ Full-screen segmented image display  
✅ Optimized for Android devices  
✅ Runs on-device without internet

## 🛠️ Tech Stack

- Android Studio  
- Kotlin  
- Jetpack Compose  
- TensorFlow Lite

## 🚀 How It Works

1. The app loads an image from the assets folder.
2. Runs the TFLite segmentation model.
3. Generates a segmentation mask (hair, clothes, background).
4. Overlays the mask on the original image.
5. Displays the final result in full screen.

## 📁 Model Used

- **Model**: `selfie_multiclass_256x256.tflite`  
- **Input Size**: 256x256  
- **Output**: Segmentation mask with multiple classes (hair, clothes, background)

## 📂 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/haidrrrry/Clothesandhairsegmentation.git
cd Clothesandhairsegmentation
```

### 2️⃣ Open in Android Studio

1. Open Android Studio.
2. Click **File → Open** and select the cloned repository.

### 3️⃣ Add Image & Model

1. Place your images in the `assets` folder (`app/src/main/assets`).
2. Ensure `selfie_multiclass_256x256.tflite` is in the `assets` folder.

### 4️⃣ Run the App

1. Select a physical device or emulator.
2. Click **Run ▶️**.

## 🧑‍💻 Usage

- The app will load the image from assets.
- Segment clothes and hair.
- Display the result on full screen.

## ⭐ Contributing

Feel free to fork the repo, create a branch, and submit a Pull Request 🚀

## 📄 License

This project is licensed under the [MIT License](LICENSE).
