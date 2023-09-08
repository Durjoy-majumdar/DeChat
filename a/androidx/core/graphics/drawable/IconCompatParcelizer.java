package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import com.tencent.xweb.file.XVFSFile;
import java.nio.charset.Charset;
import p584k4.C108881b;

public class IconCompatParcelizer {
    public static IconCompat read(C108881b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f306353a = bVar.mo160005k(iconCompat.f306353a, 1);
        byte[] bArr = iconCompat.f306355c;
        if (bVar.mo160003i(2)) {
            bArr = bVar.mo160001g();
        }
        iconCompat.f306355c = bArr;
        iconCompat.f306356d = bVar.mo160007m(iconCompat.f306356d, 3);
        iconCompat.f306357e = bVar.mo160005k(iconCompat.f306357e, 4);
        iconCompat.f306358f = bVar.mo160005k(iconCompat.f306358f, 5);
        iconCompat.f306359g = (ColorStateList) bVar.mo160007m(iconCompat.f306359g, 6);
        String str = iconCompat.f306361i;
        if (bVar.mo160003i(7)) {
            str = bVar.mo160008n();
        }
        iconCompat.f306361i = str;
        String str2 = iconCompat.f306362j;
        if (bVar.mo160003i(8)) {
            str2 = bVar.mo160008n();
        }
        iconCompat.f306362j = str2;
        iconCompat.f306360h = PorterDuff.Mode.valueOf(iconCompat.f306361i);
        switch (iconCompat.f306353a) {
            case -1:
                Parcelable parcelable = iconCompat.f306356d;
                if (parcelable != null) {
                    iconCompat.f306354b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f306356d;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f306355c;
                    iconCompat.f306354b = bArr2;
                    iconCompat.f306353a = 3;
                    iconCompat.f306357e = 0;
                    iconCompat.f306358f = bArr2.length;
                    break;
                } else {
                    iconCompat.f306354b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f306355c, Charset.forName("UTF-16"));
                iconCompat.f306354b = str3;
                if (iconCompat.f306353a == 2 && iconCompat.f306362j == null) {
                    iconCompat.f306362j = str3.split(XVFSFile.PATH_SEPARATOR, -1)[0];
                    break;
                }
            case 3:
                iconCompat.f306354b = iconCompat.f306355c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C108881b bVar) {
        bVar.getClass();
        iconCompat.f306361i = iconCompat.f306360h.name();
        switch (iconCompat.f306353a) {
            case -1:
                iconCompat.f306356d = (Parcelable) iconCompat.f306354b;
                break;
            case 1:
            case 5:
                iconCompat.f306356d = (Parcelable) iconCompat.f306354b;
                break;
            case 2:
                iconCompat.f306355c = ((String) iconCompat.f306354b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f306355c = (byte[]) iconCompat.f306354b;
                break;
            case 4:
            case 6:
                iconCompat.f306355c = iconCompat.f306354b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f306353a;
        if (-1 != i) {
            bVar.mo160015u(i, 1);
        }
        byte[] bArr = iconCompat.f306355c;
        if (bArr != null) {
            bVar.mo160010p(2);
            bVar.mo160012r(bArr);
        }
        Parcelable parcelable = iconCompat.f306356d;
        if (parcelable != null) {
            bVar.mo160010p(3);
            bVar.mo160016v(parcelable);
        }
        int i2 = iconCompat.f306357e;
        if (i2 != 0) {
            bVar.mo160015u(i2, 4);
        }
        int i3 = iconCompat.f306358f;
        if (i3 != 0) {
            bVar.mo160015u(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f306359g;
        if (colorStateList != null) {
            bVar.mo160010p(6);
            bVar.mo160016v(colorStateList);
        }
        String str = iconCompat.f306361i;
        if (str != null) {
            bVar.mo160010p(7);
            bVar.mo160017w(str);
        }
        String str2 = iconCompat.f306362j;
        if (str2 != null) {
            bVar.mo160010p(8);
            bVar.mo160017w(str2);
        }
    }
}
