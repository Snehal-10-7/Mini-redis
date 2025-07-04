#  MiniRedis (Java-based Redis Clone)

A lightweight Redis-like in-memory key-value store built using Java. This project simulates core Redis functionalities such as `SET`, `GET`, key expiry, and basic CLI interaction — great for learning how databases work under the hood!

---

##  Features

- `SET key value`: Store a key-value pair
- `GET key`: Retrieve value by key
- Key expiration handling
- Case-insensitive command input
- CLI prompt for Redis-style usage (`redis>`)
- Minimal and clean codebase

---

##  Technologies Used

- Java
- VS Code
- OOP principles
- Java Collections (HashMap)
- CLI interaction

---

##  Folder Structure

```
MiniRedis/
├── src/
│   ├── Main.java              # CLI & command handling
│   ├── RedisCore.java         # Core data storage (set, get, del)
│   ├── ExpiryManager.java     # Expiration tracking logic
│   ├── CommandParser.java     # (Optional) For future CLI command parsing
├── lib/                       # External libraries if needed
├── README.md
```

---

##  How to Run

### Prerequisites:
- Java installed (JDK 8+)
- VS Code or any IDE
- Git (optional)

### Steps:
1. Clone the repository:
```bash
git clone https://github.com/your-username/MiniRedis.git
cd MiniRedis
```

2. Compile and run:
```bash
cd src
javac *.java
java Main
```

3. Use the terminal to interact:
```text
redis> SET name Snehal
OK
redis> GET name
Snehal
redis> EXIT
```

---

##  Future Scope

- Add commands: `DEL`, `EXPIRE`, `TTL`, `KEYS`, `FLUSHALL`
- Build a web interface
- Connect to disk-based persistence
- Multi-threaded access with locks

---

## 📌 Author

👤 Snehal Kadam  
🌐 [https://github.com/your-username](https://github.com/your-username)

---

## 📜 License

This project is open-source and available under the MIT License.
