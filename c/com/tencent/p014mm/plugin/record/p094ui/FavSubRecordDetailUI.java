package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Intent;
import kotlin.Metadata;
import pb1.C100755z;
import te3.C77915dp3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/record/ui/FavSubRecordDetailUI;", "Lcom/tencent/mm/plugin/record/ui/RecordMsgBaseUI;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.record.ui.FavSubRecordDetailUI */
public class FavSubRecordDetailUI extends RecordMsgBaseUI {

    /* renamed from: s */
    public C77915dp3 f272533s;

    /* renamed from: t */
    public C100755z f272534t;

    /* renamed from: u */
    public TranslateHelper f272535u;

    /* renamed from: L7 */
    public C94356i mo129657L7() {
        return new C94349d(this, new C94348c(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = (te3.C101834rc0) sx3.C110818d0.m150925W((r0 = r0.f227155f));
     */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo129658M7() {
        /*
            r1 = this;
            te3.dp3 r0 = r1.f272533s
            if (r0 == 0) goto L_0x0013
            java.util.LinkedList<te3.rc0> r0 = r0.f227155f
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = sx3.C110818d0.m150925W(r0)
            te3.rc0 r0 = (te3.C101834rc0) r0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f299302f1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = ""
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.FavSubRecordDetailUI.mo129658M7():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = (te3.C101834rc0) sx3.C110818d0.m150916N((r0 = r0.f227155f));
     */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo129659N7() {
        /*
            r1 = this;
            te3.dp3 r0 = r1.f272533s
            if (r0 == 0) goto L_0x0013
            java.util.LinkedList<te3.rc0> r0 = r0.f227155f
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rc0 r0 = (te3.C101834rc0) r0
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f299302f1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = ""
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.FavSubRecordDetailUI.mo129659N7():java.lang.String");
    }

    /* renamed from: O7 */
    public String mo129660O7() {
        C77915dp3 dp32 = this.f272533s;
        String str = dp32 != null ? dp32.f227153d : null;
        return str == null ? "" : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[LOOP:0: B:20:0x005e->B:23:0x006c, LOOP_START] */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129661P7() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "key_detail_info_id"
            r2 = -1
            long r0 = r0.getLongExtra(r1, r2)
            pb1.z r0 = qg2.C101169u.m132684a(r0)
            r4.f272534t = r0
            if (r0 != 0) goto L_0x0019
            r4.finish()
            return
        L_0x0019:
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "record_xml"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = ""
        L_0x0028:
            te3.dp3 r0 = com.tencent.p014mm.pluginsdk.model.C96785k0.m124244a(r0)
            r4.f272533s = r0
            if (r0 != 0) goto L_0x0034
            r4.finish()
            return
        L_0x0034:
            com.tencent.mm.plugin.record.ui.b r0 = new com.tencent.mm.plugin.record.ui.b
            r0.<init>()
            pb1.z r1 = r4.f272534t
            r0.f272700c = r1
            te3.dp3 r1 = r4.f272533s
            if (r1 == 0) goto L_0x0044
            java.util.LinkedList<te3.rc0> r1 = r1.f227155f
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            r0.f272698a = r1
            qg2.v0 r1 = new qg2.v0
            r1.<init>()
            r0.f272699b = r1
            java.util.List<te3.rc0> r1 = r0.f272698a
            if (r1 != 0) goto L_0x0053
            goto L_0x006e
        L_0x0053:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            java.util.Iterator r1 = r1.iterator()
        L_0x005e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r1.next()
            te3.rc0 r2 = (te3.C101834rc0) r2
            int r2 = r2.f299322q1
            if (r2 == 0) goto L_0x005e
        L_0x006e:
            super.mo129661P7()
            com.tencent.mm.plugin.record.ui.i r1 = r4.f272537n
            r1.mo129741h(r0)
            com.tencent.mm.plugin.record.ui.TranslateHelper r1 = new com.tencent.mm.plugin.record.ui.TranslateHelper
            com.tencent.mm.plugin.record.ui.i r2 = r4.f272537n
            r1.<init>(r4, r2, r0)
            r4.f272535u = r1
            com.tencent.mm.plugin.record.ui.i r0 = r4.f272537n
            r0.f272723t = r1
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.n0 r0 = r0.mo128198DE()
            com.tencent.mm.plugin.record.ui.i r1 = r4.f272537n
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.record.ui.FavRecordAdapter"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.plugin.record.ui.d r1 = (com.tencent.p014mm.plugin.record.p094ui.C94349d) r1
            pb1.m0 r1 = r1.f272702y
            xb1.a r0 = (xb1.C102612a) r0
            r0.mo142255jo(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.FavSubRecordDetailUI.mo129661P7():void");
    }

    /* renamed from: Q7 */
    public void mo129662Q7(int i, int i2, Intent intent) {
    }

    /* renamed from: S7 */
    public void mo129663S7() {
    }

    public void onDestroy() {
        TranslateHelper translateHelper = this.f272535u;
        if (translateHelper != null) {
            translateHelper.mo129733b();
        }
        C94356i iVar = this.f272537n;
        if (iVar != null) {
            iVar.mo129745a();
        }
        super.onDestroy();
    }
}
