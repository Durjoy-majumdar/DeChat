package lg3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.vendor.Oppo;
import hi3.C87515a;
import hi3.C87517c;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import lg3.C88502j;
import p573jk.C76417a;
import p977hj.C87527b;
import wq3.C111855q;
import wq3.C91095g;
import wq3.C91096l;

/* renamed from: lg3.e */
public class C88496e extends Resources {

    /* renamed from: f */
    public static Method f255626f;

    /* renamed from: g */
    public static Method f255627g;

    /* renamed from: a */
    public C88504k f255628a;

    /* renamed from: b */
    public C88500i f255629b;

    /* renamed from: c */
    public Resources f255630c;

    /* renamed from: d */
    public boolean f255631d;

    /* renamed from: e */
    public C88494d f255632e;

    /* renamed from: lg3.e$a */
    public static class C34255a<E> extends ArrayList<E> {
        public boolean add(E e) {
            Log.m105924i("InterceptArrayList", "InterceptArrayList.add");
            return true;
        }

        public void add(int i, E e) {
            Log.m105924i("InterceptArrayList", "InterceptArrayList.add index object");
        }
    }

    public C88496e(Resources resources, C88504k kVar, C88500i iVar) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f255628a = kVar;
        if (resources instanceof C88496e) {
            this.f255630c = ((C88496e) resources).f255630c;
        } else {
            this.f255630c = resources;
        }
        this.f255629b = iVar;
        mo122948c();
        mo122947b();
    }

    /* renamed from: d */
    public static Resources m110361d(Resources resources, Context context, boolean z) {
        List<String> list = C88504k.f255643a;
        C88504k f = C88504k.m110378f(context, LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context));
        C88500i iVar = new C88500i();
        return z ? new C88496e(resources, f, iVar) : new C88496e(resources, f, iVar, new C88494d(resources.getDisplayMetrics()));
    }

    /* renamed from: f */
    public static Drawable m110362f(Resources resources, int i) {
        Resources resources2 = resources;
        Class<String> cls = String.class;
        TypedValue typedValue = new TypedValue();
        resources2.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        ColorDrawable colorDrawable = i2 >= 28 && i2 <= 31 ? new ColorDrawable(typedValue.data) : null;
        if (f255626f == null) {
            Class<Resources> cls2 = Resources.class;
            try {
                Class cls3 = Integer.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("loadXmlResourceParser", new Class[]{cls, cls3, cls3, cls});
                f255626f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.printErrStackTrace("MicroMsg.MMResources", e, "", new Object[0]);
                Log.printErrStackTrace("MicroMsg.MMResources", e, "", new Object[0]);
                return null;
            }
        }
        if (f255627g == null) {
            Class<AssetManager> cls4 = AssetManager.class;
            try {
                Class cls5 = Integer.TYPE;
                Method declaredMethod2 = cls4.getDeclaredMethod("openNonAsset", new Class[]{cls5, cls, cls5});
                f255627g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.printErrStackTrace("MicroMsg.MMResources", e2, "", new Object[0]);
                Log.printErrStackTrace("MicroMsg.MMResources", e2, "", new Object[0]);
                return null;
            }
        }
        if (colorDrawable != null) {
            return colorDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.endsWith(".xml")) {
                try {
                    XmlResourceParser xmlResourceParser = (XmlResourceParser) f255626f.invoke(resources2, new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(typedValue.assetCookie), "drawable"});
                    Drawable createFromXml = Drawable.createFromXml(resources2, xmlResourceParser);
                    xmlResourceParser.close();
                    return createFromXml;
                } catch (Exception e3) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e3);
                    throw notFoundException;
                }
            } else {
                try {
                    InputStream inputStream = (InputStream) f255627g.invoke(resources.getAssets(), new Object[]{Integer.valueOf(typedValue.assetCookie), charSequence2, 2});
                    Drawable createFromResourceStream = Drawable.createFromResourceStream(resources2, typedValue, inputStream, charSequence2, (BitmapFactory.Options) null);
                    inputStream.close();
                    return createFromResourceStream;
                } catch (Exception e4) {
                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + Integer.toHexString(i));
                    notFoundException2.initCause(e4);
                    throw notFoundException2;
                }
            }
        } else {
            throw new Resources.NotFoundException("Resource is not a Drawable (color or path): " + typedValue);
        }
    }

    /* renamed from: a */
    public final Drawable mo122946a(Drawable drawable, int i) {
        if (drawable != null) {
            return drawable;
        }
        Log.printInfoStack("MicroMsg.MMResources", "Notice!!! drawable == null!!!", new Object[0]);
        try {
            if (this.f255629b.f255638a.mo121968f(this, i)) {
                Log.m105921e("MicroMsg.MMResources", "resources name = %s, this resource %s", getResourceName(i), this);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMResources", e, "WTF", new Object[0]);
        }
        return new C87517c(new Picture(), 0);
    }

    /* renamed from: b */
    public final void mo122947b() {
        C87527b bVar = new C87527b(getAssets(), "mThemeCookies", (String) null);
        try {
            bVar.mo121999b();
            if (bVar.f253583d != null) {
                C34255a aVar = new C34255a();
                bVar.mo121999b();
                Field field = bVar.f253583d;
                if (field != null) {
                    field.set(bVar.f253580a, aVar);
                    return;
                }
                throw new NoSuchFieldException();
            }
        } catch (NoSuchFieldException e) {
            Log.printErrStackTrace("MicroMsg.MMResources", e, "", new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.printErrStackTrace("MicroMsg.MMResources", e2, "", new Object[0]);
        } catch (IllegalArgumentException e3) {
            Log.printErrStackTrace("MicroMsg.MMResources", e3, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo122948c() {
        try {
            Class<?> cls = Class.forName("android.content.res.MiuiResources");
            Log.m105924i("MicroMsg.MMResources", "sMiuiThemeEnabled false");
            Field declaredField = cls.getDeclaredField("sMiuiThemeEnabled");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.set((Object) null, Boolean.FALSE);
                return;
            }
            Log.m105921e("MicroMsg.MMResources", "some thing wrong. %s %s", cls, declaredField);
        } catch (ClassNotFoundException unused) {
            Log.m105924i("MicroMsg.MMResources", "sMiuiThemeEnabled ClassNotFoundException");
        } catch (NoSuchFieldException unused2) {
            Log.m105924i("MicroMsg.MMResources", "sMiuiThemeEnabled NoSuchFieldException");
        } catch (IllegalAccessException unused3) {
            Log.m105924i("MicroMsg.MMResources", "sMiuiThemeEnabled IllegalAccessException");
        } catch (IllegalArgumentException unused4) {
            Log.m105924i("MicroMsg.MMResources", "sMiuiThemeEnabled IllegalArgumentException");
        }
    }

    /* renamed from: e */
    public final boolean mo122949e() {
        C88504k kVar = this.f255628a;
        if (kVar != null) {
            kVar.getClass();
            if (C88504k.f255650h) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo122950g(Configuration configuration) {
        Log.m105925i("MicroMsg.MMResources", "dancy test locale %s, orientation %s, uimode:%s, systemfont:%s", configuration.locale, Integer.valueOf(configuration.orientation), Integer.valueOf(configuration.uiMode), Float.valueOf(configuration.fontScale));
        if ((C85875k4.m106149F() && MMApplicationContext.isMainProcess()) || !C85875k4.m106149F()) {
            C88497f.m110369b(configuration, this.f255630c);
            Resources resources = this.f255630c;
            if (resources != null) {
                resources.getConfiguration().updateFrom(configuration);
            }
        }
        C88494d dVar = this.f255632e;
        DisplayMetrics displayMetrics = this.f255630c.getDisplayMetrics();
        dVar.getClass();
        if (C88494d.m110351h()) {
            DisplayMetrics displayMetrics2 = C88494d.f255611c;
            displayMetrics.density = displayMetrics2.density;
            displayMetrics.densityDpi = displayMetrics2.densityDpi;
            displayMetrics.scaledDensity = displayMetrics2.scaledDensity;
            displayMetrics2.setTo(displayMetrics);
        }
        Configuration configuration2 = new Configuration(getConfiguration());
        configuration2.fontScale += 0.1f;
        super.updateConfiguration(configuration2, getDisplayMetrics());
        Oppo._isUnDefaultFont = null;
        C111855q.C111858c cVar = C111855q.f334885a;
        cVar.getClass();
        C91096l a = cVar.mo163608b().mo163573a();
        if (a != null) {
            a.mo90275b();
        }
        C91095g e = cVar.mo163608b().mo163577e();
        if (e != null) {
            e.mo125152d();
        }
        super.updateConfiguration(this.f255632e.mo122940b(configuration), getDisplayMetrics());
    }

    public int getColor(int i) {
        return (!MMApplicationContext.isMMProcess() || !C76417a.m91844a()) ? this.f255630c.getColor(i) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.FG_0) ? this.f255630c.getColor(C0966R.color.FG_0_CARE) : i == C0966R.color.FG_0_5 ? this.f255630c.getColor(C0966R.color.FG_0_5_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.FG_1) ? this.f255630c.getColor(C0966R.color.FG_1_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.FG_2) ? this.f255630c.getColor(C0966R.color.FG_2_CARE) : i == C0966R.color.UN_BW_0_Alpha_0_9 ? this.f255630c.getColor(C0966R.color.f2970b0) : (this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.f2939n) || this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.Brand_90)) ? this.f255630c.getColor(C0966R.color.Brand_100_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.f2966ao) ? this.f255630c.getColor(C0966R.color.Red_100_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.Brand_BG_100) ? this.f255630c.getColor(C0966R.color.Brand_BG_100_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.Yellow_BG_100) ? this.f255630c.getColor(C0966R.color.Yellow_BG_100_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.f2960ag) ? this.f255630c.getColor(C0966R.color.Orange_100_CARE) : this.f255630c.getColor(i) == this.f255630c.getColor(C0966R.color.f2976b7) ? this.f255630c.getColor(C0966R.color.Yellow_100_CARE) : this.f255630c.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return (!MMApplicationContext.isMMProcess() || !C76417a.m91844a()) ? super.getColorStateList(i) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.FG_0) ? super.getColorStateList(C0966R.color.FG_0_CARE) : i == C0966R.color.FG_0_5 ? super.getColorStateList(C0966R.color.FG_0_5_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.FG_1) ? super.getColorStateList(C0966R.color.FG_1_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.FG_2) ? super.getColorStateList(C0966R.color.FG_2_CARE) : i == C0966R.color.UN_BW_0_Alpha_0_9 ? super.getColorStateList(C0966R.color.f2970b0) : (super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.f2939n) || super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.Brand_90)) ? super.getColorStateList(C0966R.color.Brand_100_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.f2966ao) ? super.getColorStateList(C0966R.color.Red_100_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.Brand_BG_100) ? super.getColorStateList(C0966R.color.Brand_BG_100_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.Yellow_BG_100) ? super.getColorStateList(C0966R.color.Yellow_BG_100_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.f2960ag) ? super.getColorStateList(C0966R.color.Orange_100_CARE) : super.getColorStateList(i).getDefaultColor() == this.f255630c.getColor(C0966R.color.f2976b7) ? super.getColorStateList(C0966R.color.Yellow_100_CARE) : super.getColorStateList(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        C88494d dVar = this.f255632e;
        return dVar != null ? dVar.mo122941e() : this.f255630c.getDisplayMetrics();
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        if (i != 0) {
            C88500i iVar = this.f255629b;
            Resources resources = this.f255630c;
            Drawable e = iVar.f255638a.mo121968f(resources, i) ? C87515a.m108835e(resources, i, 0.0f) : null;
            if (e != null) {
                return e;
            }
        }
        return mo122946a(super.getDrawableForDensity(i, i2), i);
    }

    public XmlResourceParser getLayout(int i) {
        C85868k2.f250092f = i;
        return super.getLayout(i);
    }

    public String getQuantityString(int i, int i2) {
        String str;
        if (this.f255631d) {
            try {
                return WeChatBrands.Wordings.translate(this.f255630c.getResourceEntryName(i));
            } catch (Exception unused) {
                return "";
            }
        } else {
            if (mo122949e()) {
                this.f255628a.getClass();
                C88498g gVar = C88504k.f255646d;
                if (gVar == null) {
                    str = null;
                } else {
                    str = gVar.mo122969a(i, i2, new Object[0]);
                }
                if (str != null) {
                    return WeChatBrands.Wordings.translate(str);
                }
            }
            return WeChatBrands.Wordings.translate(this.f255630c.getQuantityString(i, i2));
        }
    }

    public CharSequence getQuantityText(int i, int i2) {
        if (this.f255631d) {
            try {
                return WeChatBrands.Wordings.translate(this.f255630c.getResourceEntryName(i));
            } catch (Exception unused) {
                return "";
            }
        } else {
            if (mo122949e()) {
                this.f255628a.getClass();
                C88498g gVar = C88504k.f255646d;
                String a = gVar == null ? null : gVar.mo122969a(i, i2, new Object[0]);
                if (a != null) {
                    return WeChatBrands.Wordings.translate(a);
                }
            }
            return WeChatBrands.Wordings.translate(this.f255630c.getQuantityString(i, i2));
        }
    }

    public String getString(int i) {
        String e;
        if (this.f255631d) {
            try {
                return WeChatBrands.Wordings.translate(this.f255630c.getResourceEntryName(i));
            } catch (Exception unused) {
                return "";
            }
        } else if (mo122949e() && (e = this.f255628a.mo122971e(i)) != null) {
            return WeChatBrands.Wordings.translate(e.toString().toString());
        } else {
            try {
                String string = this.f255630c.getString(i);
                List<String> list = C88504k.f255643a;
                return string != null ? WeChatBrands.Wordings.translate(string.toString()) : WeChatBrands.Wordings.translate(this.f255630c.getString(i));
            } catch (Exception unused2) {
                return "";
            }
        }
    }

    public String[] getStringArray(int i) {
        int indexOfKey;
        String[] strArr = null;
        if (mo122949e()) {
            this.f255628a.getClass();
            C88502j jVar = C88504k.f255647e;
            if (jVar != null && (indexOfKey = jVar.f255640a.indexOfKey(i)) >= 0) {
                int length = indexOfKey < jVar.f255640a.size() + -1 ? jVar.f255640a.valueAt(indexOfKey + 1).f255642a[0] : jVar.f255641b.length;
                C88502j.C88503a valueAt = jVar.f255640a.valueAt(indexOfKey);
                int length2 = valueAt.f255642a.length;
                if (length2 > 0) {
                    strArr = new String[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (i2 < length2 - 1) {
                            byte[] bArr = jVar.f255641b;
                            int[] iArr = valueAt.f255642a;
                            int i3 = iArr[i2];
                            strArr[i2] = new String(bArr, i3, iArr[i2 + 1] - i3);
                        } else {
                            byte[] bArr2 = jVar.f255641b;
                            int i4 = valueAt.f255642a[i2];
                            strArr[i2] = new String(bArr2, i4, length - i4);
                        }
                    }
                }
            }
        }
        if (strArr == null && ((strArr = super.getStringArray(i)) == null || strArr.length == 0)) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String translate : strArr) {
            arrayList.add(WeChatBrands.Wordings.translate(translate));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public CharSequence getText(int i) {
        String e;
        if (this.f255631d) {
            try {
                return WeChatBrands.Wordings.translate(this.f255630c.getResourceEntryName(i));
            } catch (Exception unused) {
                return "";
            }
        } else if (mo122949e() && (e = this.f255628a.mo122971e(i)) != null) {
            return WeChatBrands.Wordings.translate(e.toString());
        } else {
            String string = this.f255630c.getString(i);
            List<String> list = C88504k.f255643a;
            if (string != null) {
                return WeChatBrands.Wordings.translate(string.toString());
            }
            return WeChatBrands.Wordings.translate(this.f255630c.getString(i));
        }
    }

    public CharSequence[] getTextArray(int i) {
        String[] stringArray = getStringArray(i);
        return stringArray != null ? stringArray : super.getTextArray(i);
    }

    public XmlResourceParser getXml(int i) {
        return super.getXml(i);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f255630c.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return super.openRawResource(i, typedValue);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        try {
            if ((C85875k4.m106149F() && MMApplicationContext.isMainProcess()) || !C85875k4.m106149F()) {
                C88497f.m110369b(configuration, this.f255630c);
                Resources resources = this.f255630c;
                if (resources != null) {
                    resources.getConfiguration().updateFrom(configuration);
                    this.f255630c.updateConfiguration(configuration, displayMetrics);
                }
            }
            C88494d dVar = this.f255632e;
            if (dVar != null) {
                dVar.mo122944o(configuration, displayMetrics);
            }
        } catch (UnsatisfiedLinkError e) {
            Log.printErrStackTrace("MicroMsg.MMResources", e, "Rarely exception.", new Object[0]);
        }
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        if (i != 0) {
            C88500i iVar = this.f255629b;
            Resources resources = this.f255630c;
            Drawable e = iVar.f255638a.mo121968f(resources, i) ? C87515a.m108835e(resources, i, 0.0f) : null;
            if (e != null) {
                return e;
            }
        }
        return mo122946a(super.getDrawableForDensity(i, i2, theme), i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        String str;
        if (this.f255631d) {
            try {
                return WeChatBrands.Wordings.translate(this.f255630c.getResourceEntryName(i));
            } catch (Exception unused) {
                return "";
            }
        } else {
            if (mo122949e()) {
                this.f255628a.getClass();
                C88498g gVar = C88504k.f255646d;
                if (gVar == null) {
                    str = null;
                } else {
                    str = gVar.mo122969a(i, i2, objArr);
                }
                if (str != null) {
                    return str.toString();
                }
            }
            return WeChatBrands.Wordings.translate(this.f255630c.getQuantityString(i, i2, objArr));
        }
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        String e;
        if (this.f255631d) {
            try {
                return WeChatBrands.Wordings.translate(this.f255630c.getResourceEntryName(i));
            } catch (Exception unused) {
                return "";
            }
        } else if (mo122949e() && (e = this.f255628a.mo122971e(i)) != null) {
            return WeChatBrands.Wordings.translate(e.toString());
        } else {
            String string = this.f255630c.getString(i);
            List<String> list = C88504k.f255643a;
            if (string != null) {
                return WeChatBrands.Wordings.translate(string.toString());
            }
            return WeChatBrands.Wordings.translate(this.f255630c.getString(i));
        }
    }

    public C88496e(Resources resources, C88504k kVar, C88500i iVar, C88494d dVar) {
        super(resources.getAssets(), dVar.mo122941e(), dVar.mo122940b(resources.getConfiguration()));
        this.f255632e = dVar;
        this.f255628a = kVar;
        if (resources instanceof C88496e) {
            this.f255630c = ((C88496e) resources).f255630c;
        } else {
            this.f255630c = resources;
        }
        this.f255629b = iVar;
        mo122948c();
        mo122947b();
        try {
            this.f255631d = MMApplicationContext.getDefaultPreference().getBoolean("ShowStringName", false);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMResources", e.getMessage());
        }
        Log.m105925i("MicroMsg.MMResources", "originalResources:%s mmresource:%s", resources, this);
    }
}
