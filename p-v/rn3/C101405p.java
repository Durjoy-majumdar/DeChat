package rn3;

import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: rn3.p */
public class C101405p implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f297014d;

    /* renamed from: e */
    public final /* synthetic */ int f297015e;

    /* renamed from: f */
    public final /* synthetic */ int f297016f;

    /* renamed from: g */
    public final /* synthetic */ String f297017g;

    /* renamed from: h */
    public final /* synthetic */ String f297018h;

    /* renamed from: i */
    public final /* synthetic */ String f297019i;

    /* renamed from: j */
    public final /* synthetic */ String f297020j;

    /* renamed from: n */
    public final /* synthetic */ int f297021n;

    /* renamed from: o */
    public final /* synthetic */ C92836k f297022o;

    /* renamed from: p */
    public final /* synthetic */ MsgRetransmitUI f297023p;

    public C101405p(MsgRetransmitUI msgRetransmitUI, C72963f4 f4Var, int i, int i2, String str, String str2, String str3, String str4, int i3, C92836k kVar) {
        this.f297023p = msgRetransmitUI;
        this.f297014d = f4Var;
        this.f297015e = i;
        this.f297016f = i2;
        this.f297017g = str;
        this.f297018h = str2;
        this.f297019i = str3;
        this.f297020j = str4;
        this.f297021n = i3;
        this.f297022o = kVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (dVar != null) {
            if (dVar.field_exist_whencheck) {
                Log.m105925i("MicroMsg.MsgRetransmitUI", "support second !! sceneResult:[%s]", dVar);
                MsgRetransmitUI.m125189E7(this.f297023p, dVar, this.f297014d, this.f297015e, this.f297016f, this.f297017g, this.f297018h, this.f297019i, this.f297020j, this.f297021n);
            } else {
                Log.m105924i("MicroMsg.MsgRetransmitUI", "not support second !! dealDownLoadImg");
                MsgRetransmitUI msgRetransmitUI = this.f297023p;
                C92836k kVar = this.f297022o;
                C72963f4 f4Var = this.f297014d;
                String str2 = this.f297019i;
                int i2 = this.f297015e;
                String str3 = this.f297017g;
                String str4 = this.f297018h;
                int i3 = MsgRetransmitUI.f285342V0;
                msgRetransmitUI.mo136226H7(kVar, f4Var, str2, i2, str3, str4);
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
