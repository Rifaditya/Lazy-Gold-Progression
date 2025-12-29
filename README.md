# 🏆 Vanilla Outsider: Gold Progression

A Fabric mod for Minecraft 1.21.11 that rebalances vanilla progression by making Gold tier equipment actually useful and creating a smoother stat scaling between tiers.

> **Created by DasikIgaijin** — Made with AI assistance from Claude Opus 4.5

---

## 📖 Overview

In vanilla Minecraft, Gold equipment is often overlooked due to its low durability and underwhelming stats compared to Iron. **Vanilla Outsider: Gold Progression** addresses this by transforming Gold into a legitimate mid-game tier, bridging the gap between Stone and Iron tools while adding unique characteristics that make it worthwhile to craft and use.

This mod is part of the **Vanilla Outsider** collection — mods that enhance vanilla Minecraft using only vanilla items, bringing an outsider's perspective to pure vanilla gameplay.

---

## ✨ Features

### 🔧 Rebalanced Gold Equipment

Gold tools and armor have been completely rebalanced to serve as a viable progression step:

| Equipment Type | Changes |
|---------------|---------|
| **Golden Sword** | Improved damage and durability |
| **Golden Pickaxe** | Enhanced mining speed and durability |
| **Golden Axe** | Better chopping efficiency |
| **Golden Shovel** | Increased digging speed |
| **Golden Hoe** | More practical for farming |
| **Golden Armor Set** | Balanced protection values |

### 📊 Stat Scaling Philosophy

The mod implements a smooth progression curve:

```
Wood → Stone → Iron → Gold → Diamond → Netherite
```

Gold now sits comfortably between Iron and Diamond, making mid-game progression feel more rewarding and giving players a reason to invest in gold equipment.

### 🎯 Key Benefits

- **No More Wasted Gold**: Gold equipment is now a practical choice, not just for enchanting
- **Smoother Progression**: Natural tier advancement that feels balanced
- **Vanilla-Friendly**: Integrates seamlessly with the base game aesthetic
- **Lightweight**: Minimal performance impact on your game

---

## 📦 Installation

### Requirements

- **Minecraft**: 1.21.11
- **Fabric Loader**: 0.18.4 or higher
- **Fabric API**: Latest version
- **Fabric Language Kotlin**: Required for mod functionality

### Steps

1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft 1.21.11
2. Download and install [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download and install [Fabric Language Kotlin](https://modrinth.com/mod/fabric-language-kotlin)
4. Download the latest release of **Vanilla Outsider: Gold Progression**
5. Place the mod `.jar` file in your `mods` folder
6. Launch Minecraft with the Fabric profile

---

## 🔨 Technical Details

### Modified Recipes

The mod includes custom crafting recipes for all golden equipment pieces:

- `golden_sword.json`
- `golden_pickaxe.json`
- `golden_axe.json`
- `golden_shovel.json`
- `golden_hoe.json`
- `golden_helmet.json`
- `golden_chestplate.json`
- `golden_leggings.json`
- `golden_boots.json`

### Mod Structure

```
vanilla-outsider-gold-progression/
├── src/main/kotlin/com/dasik/betterprogression/
│   ├── BetterVanillaProgression.kt    # Main mod entrypoint
│   └── ModConfig.kt                    # Configuration handling
├── src/main/resources/
│   ├── data/minecraft/recipe/          # Custom recipes
│   └── fabric.mod.json                 # Mod metadata
└── src/client/kotlin/                   # Client-side code
```

---

## 🤝 Compatibility

- ✅ Compatible with most other Fabric mods
- ✅ Works alongside other recipe modification mods
- ✅ Multiplayer compatible (server-side installation required)

---

## 📜 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 👤 Credits

- **DasikIgaijin** - Mod Creator & Designer
- **Claude Opus 4.5** - AI Development Assistant

---

## 🔗 Links

- [GitHub Repository](https://github.com/Rifaditya/Vanilla-Outsider-Gold-Progression)
- [Issue Tracker](https://github.com/Rifaditya/Vanilla-Outsider-Gold-Progression/issues)

---

<div align="center">

**Made with ❤️ for the Minecraft community**

*Part of the Vanilla Outsider Collection*

</div>
