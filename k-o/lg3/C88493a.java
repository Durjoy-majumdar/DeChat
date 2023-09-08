package lg3;

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
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import java.io.InputStream;

/* renamed from: lg3.a */
public class C88493a extends Resources {

    /* renamed from: a */
    public final Resources f255610a;

    public C88493a(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f255610a = resources;
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f255610a.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.f255610a.getBoolean(i);
    }

    public int getColor(int i, Resources.Theme theme) {
        return this.f255610a.getColor(i, theme);
    }

    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.f255610a.getColorStateList(i, theme);
    }

    public Configuration getConfiguration() {
        return this.f255610a.getConfiguration();
    }

    public float getDimension(int i) {
        return this.f255610a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.f255610a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.f255610a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f255610a.getDisplayMetrics();
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f255610a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f255610a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.f255610a.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.f255610a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f255610a.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.f255610a.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f255610a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return WeChatBrands.Wordings.translate(this.f255610a.getQuantityString(i, i2));
    }

    public String getResourceEntryName(int i) {
        return this.f255610a.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.f255610a.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f255610a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f255610a.getResourceTypeName(i);
    }

    public String getString(int i) {
        return WeChatBrands.Wordings.translate(this.f255610a.getString(i));
    }

    public String[] getStringArray(int i) {
        return this.f255610a.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return WeChatBrands.Wordings.translate(this.f255610a.getString(i));
    }

    public CharSequence[] getTextArray(int i) {
        return this.f255610a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f255610a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f255610a.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.f255610a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f255610a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f255610a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.f255610a.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f255610a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f255610a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f255610a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f255610a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public int getColor(int i) {
        return this.f255610a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f255610a.getColorStateList(i);
    }

    public String getQuantityString(int i, int i2) {
        return this.f255610a.getQuantityString(i, i2);
    }

    public String getString(int i, Object... objArr) {
        return this.f255610a.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f255610a.getText(i, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f255610a.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f255610a.openRawResource(i, typedValue);
    }
}
