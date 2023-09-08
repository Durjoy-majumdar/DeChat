package pt3;

import android.content.Context;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.security.Signature;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21885g;

/* renamed from: pt3.b */
public abstract class C22005b {
    /* renamed from: q */
    public static C117897l m25358q(byte[] bArr) {
        if (bArr == null) {
            C21881e.m25083b("Soter.SoterCoreBase", "soter: raw data is null", new Object[0]);
            return null;
        }
        if (bArr.length < 4) {
            C21881e.m25083b("Soter.SoterCoreBase", "soter: raw data length smaller than RAW_LENGTH_PREFIX", new Object[0]);
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (bArr2[i2] & ExifInterface.MARKER) << (i2 * 8);
        }
        C21881e.m25082a("Soter.SoterCoreBase", "soter: parsed raw length: " + i, new Object[0]);
        if (i > 1048576) {
            C21881e.m25083b("Soter.SoterCoreBase", "soter: too large json result!", new Object[0]);
            return null;
        }
        byte[] bArr3 = new byte[i];
        int i3 = i + 4;
        if (bArr.length < i3) {
            C21881e.m25083b("Soter.SoterCoreBase", "length not correct 2", new Object[0]);
            return null;
        }
        System.arraycopy(bArr, 4, bArr3, 0, i);
        String str = new String(bArr3);
        C21881e.m25082a("Soter.SoterCoreBase", "soter: to convert json: " + str, new Object[0]);
        C117897l lVar = new C117897l(str, "");
        int length = bArr.length - i3;
        C21881e.m25082a("Soter.SoterCoreBase", "soter: signature length: " + length, new Object[0]);
        if (length != 0) {
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i3, bArr4, 0, length);
            lVar.f352430g = Base64.encodeToString(bArr4, 2);
        }
        return lVar;
    }

    /* renamed from: a */
    public abstract byte[] mo35100a(long j);

    /* renamed from: b */
    public abstract C21885g mo35097b();

    /* renamed from: c */
    public abstract C21885g mo35101c(String str);

    /* renamed from: d */
    public abstract C117897l mo35098d();

    /* renamed from: e */
    public abstract Signature mo35102e(String str);

    /* renamed from: f */
    public abstract C117897l mo35103f(String str);

    /* renamed from: g */
    public abstract boolean mo35104g();

    /* renamed from: h */
    public abstract boolean mo35105h(String str);

    /* renamed from: i */
    public abstract SoterSessionResult mo35106i(String str, String str2);

    /* renamed from: j */
    public abstract boolean mo35107j(Context context);

    /* renamed from: k */
    public abstract boolean mo35108k();

    /* renamed from: l */
    public abstract boolean mo35109l(String str, boolean z);

    /* renamed from: m */
    public abstract boolean mo35110m();

    /* renamed from: n */
    public boolean mo35111n() {
        return true;
    }

    /* renamed from: o */
    public abstract C21885g mo35112o();

    /* renamed from: p */
    public abstract C21885g mo35113p(String str, boolean z);

    /* renamed from: r */
    public void mo35114r(C110247f fVar) {
    }

    /* renamed from: s */
    public void mo35115s() {
    }

    /* renamed from: t */
    public void mo35116t() {
    }
}
