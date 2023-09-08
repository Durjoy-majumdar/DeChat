package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.tencent.xweb.file.XVFSFile;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f306352k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f306353a;

    /* renamed from: b */
    public Object f306354b;

    /* renamed from: c */
    public byte[] f306355c;

    /* renamed from: d */
    public Parcelable f306356d;

    /* renamed from: e */
    public int f306357e;

    /* renamed from: f */
    public int f306358f;

    /* renamed from: g */
    public ColorStateList f306359g;

    /* renamed from: h */
    public PorterDuff.Mode f306360h;

    /* renamed from: i */
    public String f306361i;

    /* renamed from: j */
    public String f306362j;

    public IconCompat() {
        this.f306353a = -1;
        this.f306355c = null;
        this.f306356d = null;
        this.f306357e = 0;
        this.f306358f = 0;
        this.f306359g = null;
        this.f306360h = f306352k;
        this.f306361i = null;
    }

    /* renamed from: c */
    public static IconCompat m138052c(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f306357e = i;
            if (resources != null) {
                try {
                    iconCompat.f306354b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f306354b = str;
            }
            iconCompat.f306362j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: d */
    public int mo144944d() {
        int i;
        int i2 = this.f306353a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f306354b;
            if (i >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } else if (i2 == 2) {
            return this.f306357e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    /* renamed from: e */
    public int mo144945e() {
        int i;
        int i2 = this.f306353a;
        if (i2 != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            return i2;
        }
        Icon icon = (Icon) this.f306354b;
        if (i >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(icon);
            return -1;
        } catch (InvocationTargetException unused2) {
            Objects.toString(icon);
            return -1;
        } catch (NoSuchMethodException unused3) {
            Objects.toString(icon);
            return -1;
        }
    }

    /* renamed from: f */
    public Uri mo144946f() {
        int i;
        int i2 = this.f306353a;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f306354b;
            if (i >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        } else if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f306354b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    @Deprecated
    /* renamed from: g */
    public Icon mo144947g() {
        Icon icon;
        int i;
        int i2 = this.f306353a;
        String str = null;
        switch (i2) {
            case -1:
                return (Icon) this.f306354b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f306354b);
                break;
            case 2:
                if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
                    Icon icon2 = (Icon) this.f306354b;
                    if (i >= 28) {
                        str = icon2.getResPackage();
                    } else {
                        try {
                            str = (String) icon2.getClass().getMethod("getResPackage", new Class[0]).invoke(icon2, new Object[0]);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else if (i2 == 2) {
                    str = TextUtils.isEmpty(this.f306362j) ? ((String) this.f306354b).split(XVFSFile.PATH_SEPARATOR, -1)[0] : this.f306362j;
                } else {
                    throw new IllegalStateException("called getResPackage() on " + this);
                }
                icon = Icon.createWithResource(str, this.f306357e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f306354b, this.f306357e, this.f306358f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f306354b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    Bitmap bitmap = (Bitmap) this.f306354b;
                    int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    float f = ((float) min) * 0.5f;
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f, f, 0.9166667f * f, paint);
                    canvas.setBitmap((Bitmap) null);
                    icon = Icon.createWithBitmap(createBitmap);
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f306354b);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(mo144946f());
                    break;
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + mo144946f());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.f306359g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f306360h;
        if (mode == f306352k) {
            return icon;
        }
        icon.setTintMode(mode);
        return icon;
    }

    public String toString() {
        String str;
        if (this.f306353a == -1) {
            return String.valueOf(this.f306354b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f306353a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f306353a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f306354b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f306354b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f306362j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo144944d())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f306357e);
                if (this.f306358f != 0) {
                    sb.append(" off=");
                    sb.append(this.f306358f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f306354b);
                break;
        }
        if (this.f306359g != null) {
            sb.append(" tint=");
            sb.append(this.f306359g);
        }
        if (this.f306360h != f306352k) {
            sb.append(" mode=");
            sb.append(this.f306360h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f306355c = null;
        this.f306356d = null;
        this.f306357e = 0;
        this.f306358f = 0;
        this.f306359g = null;
        this.f306360h = f306352k;
        this.f306361i = null;
        this.f306353a = i;
    }
}
