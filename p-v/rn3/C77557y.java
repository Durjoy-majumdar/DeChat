package rn3;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: rn3.y */
public class C77557y implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C72683d f226109d;

    /* renamed from: e */
    public final /* synthetic */ String f226110e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f226111f;

    /* renamed from: g */
    public final /* synthetic */ C68070l.C68072b f226112g;

    /* renamed from: h */
    public final /* synthetic */ String f226113h;

    /* renamed from: i */
    public final /* synthetic */ byte[] f226114i;

    /* renamed from: j */
    public final /* synthetic */ MsgRetransmitUI f226115j;

    public C77557y(MsgRetransmitUI msgRetransmitUI, C72683d dVar, String str, C72963f4 f4Var, C68070l.C68072b bVar, String str2, byte[] bArr) {
        this.f226115j = msgRetransmitUI;
        this.f226109d = dVar;
        this.f226110e = str;
        this.f226111f = f4Var;
        this.f226112g = bVar;
        this.f226113h = str2;
        this.f226114i = bArr;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C72683d dVar2 = this.f226109d;
        dVar2.field_fileFullPath = this.f226110e;
        if (i == 0 && cVar != null) {
            dVar2.field_offset = cVar.field_finishedLength;
            C72709y1.vx0().update(this.f226109d, new String[0]);
        }
        if (i == 0 && dVar != null && dVar.field_retCode == 0) {
            C72683d dVar3 = this.f226109d;
            dVar3.field_status = 199;
            dVar3.field_offset = dVar3.field_totalLen;
            C72709y1.vx0().update(this.f226109d, new String[0]);
            this.f226111f.mo100991d(3);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f226111f.getMsgId(), this.f226111f);
            C68070l.C68072b bVar = this.f226112g;
            MsgRetransmitUI.m125191W7((Long) C72695v.m85053F(bVar, bVar.f195562d, bVar.f195484F, this.f226113h, this.f226110e, this.f226114i, this.f226115j.f285355M).second, this.f226113h, Long.valueOf(this.f226115j.f285374f));
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
