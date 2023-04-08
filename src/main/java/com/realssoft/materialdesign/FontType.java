package com.realssoft.materialdesign;

public enum FontType
{

    GOOGLE_MS_OUTLINED("/font/google/MaterialSymbolsOutlined.ttf"),
    GOOGLE_MS_SHARP("/font/google/MaterialSymbolsSharp.ttf"),
    GOOGLE_MS_ROUNDED("/font/google/MaterialSymbolsRounded.ttf"),

    MICROSOFT_SEGOE_FLUENT_ICON("font/microsoft/SegoeFluentIcons.ttf"),
    MICROSOFT_SEGOE_MDL2("font/microsoft/SegMDL2.ttf");

    private final String path;

    FontType(String path)
    {
        this.path = path;
    }

    public String getPath()
    {
        return path;
    }

    public static TypeIcon getTypeIcon(FontType fontType)
    {
        if(fontType == FontType.MICROSOFT_SEGOE_FLUENT_ICON ||
                fontType == MICROSOFT_SEGOE_MDL2)
        {
            return TypeIcon.MICROSOFT_ICON;
        }
        return TypeIcon.GOOGLE_ICON;
    }

}
