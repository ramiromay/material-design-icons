package com.realssoft.materialdesign;

public class Utils
{
    public static IconFont getIconFont(FontType fontType)
    {
        return () -> Utils.class.getResourceAsStream(fontType.getPath());
    }

}