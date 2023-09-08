package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.a */
public class C84918a extends Resources {

    /* renamed from: a */
    public final Resources f247508a;

    public C84918a(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f247508a = resources;
    }

    /* renamed from: a */
    public final int mo117683a(int i) {
        return super.getDimensionPixelOffset(i);
    }

    /* renamed from: b */
    public final int mo117684b(int i) {
        return super.getDimensionPixelSize(i);
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f247508a.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.f247508a.getBoolean(i);
    }

    public int getColor(int i, Resources.Theme theme) {
        return this.f247508a.getColor(i, theme);
    }

    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.f247508a.getColorStateList(i, theme);
    }

    public Configuration getConfiguration() {
        return this.f247508a.getConfiguration();
    }

    public float getDimension(int i) {
        return this.f247508a.getDimension(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f247508a.getDisplayMetrics();
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f247508a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f247508a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.f247508a.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.f247508a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f247508a.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.f247508a.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f247508a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.f247508a.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) {
        return this.f247508a.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.f247508a.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f247508a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f247508a.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.f247508a.getString(i);
    }

    public String[] getStringArray(int i) {
        return this.f247508a.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.f247508a.getText(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f247508a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f247508a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f247508a.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.f247508a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f247508a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f247508a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.f247508a.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f247508a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f247508a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f247508a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f247508a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public int getColor(int i) {
        return this.f247508a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f247508a.getColorStateList(i);
    }

    public String getQuantityString(int i, int i2) {
        return this.f247508a.getQuantityString(i, i2);
    }

    public String getString(int i, Object... objArr) {
        return this.f247508a.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f247508a.getText(i, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f247508a.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f247508a.openRawResource(i, typedValue);
    }
}
