package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import hd0.C98429r0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p682rz.C101488s;
import p682rz.C101491u;
import p823sg.C101614i;

/* renamed from: com.tencent.mm.ui.chatting.z0 */
public class C97186z0 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ String f285177d;

    /* renamed from: e */
    public final /* synthetic */ String f285178e;

    /* renamed from: f */
    public final /* synthetic */ int f285179f;

    /* renamed from: g */
    public final /* synthetic */ int f285180g;

    /* renamed from: h */
    public final /* synthetic */ String f285181h;

    /* renamed from: i */
    public final /* synthetic */ String f285182i;

    /* renamed from: j */
    public final /* synthetic */ String f285183j;

    /* renamed from: n */
    public final /* synthetic */ C72963f4 f285184n;

    /* renamed from: o */
    public final /* synthetic */ int f285185o;

    /* renamed from: com.tencent.mm.ui.chatting.z0$a */
    public class C97187a implements C92834j {

        /* renamed from: a */
        public final /* synthetic */ String f285186a;

        public C97187a(C97186z0 z0Var, String str) {
            this.f285186a = str;
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f285186a);
            Zd.f288562i = 111;
            Zd.f288548P = 256;
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137733w(Zd);
            Log.m105919d("MicroMsg.ChattingEditModeLogic", "NetSceneUploadVideoForCdn callback, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public C97186z0(String str, String str2, int i, int i2, String str3, String str4, String str5, C72963f4 f4Var, int i3) {
        this.f285177d = str;
        this.f285178e = str2;
        this.f285179f = i;
        this.f285180g = i2;
        this.f285181h = str3;
        this.f285182i = str4;
        this.f285183j = str5;
        this.f285184n = f4Var;
        this.f285185o = i3;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Class cls = C101488s.class;
        if (dVar != null) {
            if (dVar.field_exist_whencheck) {
                dVar.field_fileId = this.f285177d;
                dVar.field_aesKey = this.f285178e;
                dVar.field_thumbimgLength = this.f285179f;
                dVar.field_fileLength = (long) this.f285180g;
                dVar.field_toUser = this.f285181h;
                dVar.field_filemd5 = this.f285182i;
                dVar.field_mp4identifymd5 = this.f285183j;
                Log.m105925i("MicroMsg.ChattingEditModeLogic", "support second!! sceneResult: %s", dVar);
                String str2 = this.f285181h;
                C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                String a = C98426q0.m127793a(str2);
                C86013q1.m106442c(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(this.f285184n.mo108765s2()), ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(a));
                String str3 = ((("<msg><videomsg aeskey=\"" + this.f285178e + "\" cdnthumbaeskey=\"" + this.f285178e + "\" cdnvideourl=\"" + this.f285177d + "\" ") + "cdnthumburl=\"" + this.f285177d + "\" ") + "length=\"" + this.f285180g + "\" ") + "cdnthumblength=\"" + this.f285179f + "\"/></msg>";
                Log.m105925i("MicroMsg.ChattingEditModeLogic", "cdn callback new build cdnInfo:%s", str3);
                C98429r0.m127829t(a, this.f285185o, this.f285181h, str3, 43, this.f285184n.getMsgId());
                C92855q0 f = C92855q0.m117113f();
                f.f267460C = a;
                f.f267461D = 0;
                f.f267462E = dVar;
                f.f267463F = new C97187a(this, a);
                f.f295194h = 4;
                f.mo140195a().mo123694a();
            } else {
                C86709a0.m107525e().postToWorker(new C73308a1(this.f285184n, this.f285181h));
            }
        }
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
