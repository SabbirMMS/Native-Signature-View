
# 🖋️ NativeSignatureView

A lightweight custom signature view built using **100% native Android SDK**. No third-party libraries — just `Path`, `Paint`, `Canvas`, and clean code. Users can draw their signature directly on the screen and save it as a bitmap.

---

## ✨ Features

- 🖌️ Smooth signature drawing using touch
- 🧠 Uses native methods: `moveTo()`, `lineTo()`, `reset()`
- 📲 Easily clear or extract signature as `Bitmap`
- 🚀 No third-party dependencies – fast, secure, and lightweight
- 🛡️ Fully compliant with Google Play policies

---

## 🔧 Built With

- Android SDK
- Kotlin/Java (Java version included)
- `Path`, `Paint`, `Canvas`, `Bitmap`

---

## 🧪 Usage

### 1. Add `SignatureView.java` to your project

```java
// Draws signature based on user touch
public class SignatureView extends View {
    ...
}
````

### 2. Use in XML Layout

```xml
<com.mmsstudio.signature_feature_os.Methods.SignatureView
    android:id="@+id/signatureView"
    android:layout_width="match_parent"
    android:layout_height="300dp"
    android:background="#FFFFFF" />
```

### 3. Handle in Activity

```java
SignatureView signatureView = findViewById(R.id.signatureView);

// Clear signature
signatureView.clear();

// Get signature bitmap
Bitmap signature = signatureView.getSignatureBitmap();
```

---

## 📸 Preview

![Samle Preview of NativeSignatureView](https://i.postimg.cc/jj3CMJcb/Native-Signature-View.jpg)

---

## 📜 License

This project is open-source and free to use. Attribution is appreciated but not required. 💚

---

## 🙌 Contributions

Feel free to fork, improve, or adapt this component in your own projects. PRs are welcome!

