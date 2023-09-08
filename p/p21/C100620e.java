package p21;

import com.tencent.p014mm.plugin.announcement.C29091f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import o21.C100273b;
import p749xh.C38564g1;
import te3.C101834rc0;

/* renamed from: p21.e */
public class C100620e extends C100616a {

    /* renamed from: l */
    public String f294807l = "";

    /* renamed from: m */
    public C101834rc0 f294808m;

    /* renamed from: n */
    public C101834rc0 f294809n;

    /* renamed from: o */
    public long f294810o;

    /* renamed from: p */
    public int f294811p;

    /* renamed from: q */
    public boolean f294812q;

    /* renamed from: r */
    public String f294813r;

    /* renamed from: c */
    public void mo140077c() {
        if (this.f294808m != null || this.f294809n != null) {
            if (C38564g1.f102317i.selectAll().where(C38564g1.f102319n.equal(this.f294795a)).log("MicroMsg.SDK.BaseChatroomNoticeAttachIndex").build().multiQuery(C29091f.f79662e.getDB(), C38564g1.class).size() < 1) {
                C101834rc0 rc02 = this.f294808m;
                if (rc02 == null) {
                    rc02 = this.f294809n;
                }
                String c = C100273b.m131075c(rc02);
                String e = C100273b.m131077e(rc02);
                C86013q1.m106447h(c);
                C86013q1.m106447h(e);
                Log.m105925i("MicroMsg.Editor.EditorDataItem", "del attach. type:%d, dataPath:%s thumbPath:%s", Integer.valueOf(rc02.f299258I), c, e);
            }
        }
    }
}
