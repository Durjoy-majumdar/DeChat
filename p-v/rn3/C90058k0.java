package rn3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: rn3.k0 */
public class C90058k0 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ String f258716d;

    /* renamed from: e */
    public final /* synthetic */ WXMediaMessage f258717e;

    /* renamed from: f */
    public final /* synthetic */ String f258718f;

    /* renamed from: g */
    public final /* synthetic */ SendAppMessageWrapperUI f258719g;

    public C90058k0(SendAppMessageWrapperUI sendAppMessageWrapperUI, String str, WXMediaMessage wXMediaMessage, String str2) {
        this.f258719g = sendAppMessageWrapperUI;
        this.f258716d = str;
        this.f258717e = wXMediaMessage;
        this.f258718f = str2;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (i != 0 || dVar == null || dVar.field_retCode != 0) {
            return 0;
        }
        Bitmap bitmap = null;
        try {
            if (C86013q1.m106450k(this.f258716d)) {
                bitmap = BitmapFactory.decodeStream(C86013q1.m106423E(this.f258716d));
            }
        } catch (FileNotFoundException unused) {
        }
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            this.f258717e.thumbData = byteArrayOutputStream.toByteArray();
        }
        SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f258719g;
        String str2 = this.f258718f;
        WXMediaMessage wXMediaMessage = this.f258717e;
        int i2 = SendAppMessageWrapperUI.f250361A;
        sendAppMessageWrapperUI.mo119874R7(str2, wXMediaMessage);
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
