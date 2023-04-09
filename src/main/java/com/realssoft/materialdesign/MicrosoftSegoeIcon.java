package com.realssoft.materialdesign;

public enum MicrosoftSegoeIcon implements IconCode
{

    PHOTO('\ue91b'),
    CHROME_MINIMIZE('\ue921'),
    CHROME_MAXIMIZE('\ue922'),
    CHROME_RESTORE('\uE923'),
    CHROME_CLOSE('\ue8bb'),
    HOME_SOLID('\uea8a'),
    INFO_SOLID('\uf167'),
    CONTACT_SOLID('\uea8c');

    private final char character;

    MicrosoftSegoeIcon(char character)
    {
        this.character = character;
    }

    @Override
    public char getUnicode()
    {
        return character;
    }

    @Override
    public String getFontFamily()
    {
        return "Microsoft Icons";
    }

}