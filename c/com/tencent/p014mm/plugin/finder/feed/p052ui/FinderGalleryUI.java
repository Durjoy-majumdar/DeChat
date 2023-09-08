package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPickerDataReportStruct;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import er1.C58684b;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8808v4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import te3.C50687oi1;
import up1.C37521f;
import vf1.C65697g0;
import z04.C112551y;
import zc1.C66785b;
import zf1.C66792b;
import zf1.C66795c;
import zf1.C66800f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGalleryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI */
public final class FinderGalleryUI extends MMFinderUI {

    /* renamed from: o */
    public final String f158900o = "Finder.FinderGalleryUI";

    /* renamed from: p */
    public C66795c f158901p;

    /* renamed from: q */
    public C66792b f158902q;

    /* renamed from: r */
    public final int f158903r = 1;

    /* renamed from: s */
    public final int f158904s = 2;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI$a */
    public static final class C55806a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryUI f158905d;

        public C55806a(FinderGalleryUI finderGalleryUI) {
            this.f158905d = finderGalleryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f158905d.mo77411N7().mo77486k();
            this.f158905d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI$b */
    public static final class C55807b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderGalleryUI f158906d;

        public C55807b(FinderGalleryUI finderGalleryUI) {
            this.f158906d = finderGalleryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent(this.f158906d.getIntent());
            FinderGalleryUI finderGalleryUI = this.f158906d;
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            C87412m.m108594g(finderGalleryUI, "context");
            intent.putExtra("SOURCE_REQUEST_CODE", 20000);
            intent.setClass(finderGalleryUI, FinderGallerySearchUI.class);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(20000);
            aVar.mo10233c(intent);
            C117292a.m165364j(finderGalleryUI, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGallerySearchUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
            finderPickerDataReportStruct.mo76266t(C66800f.f191914b);
            finderPickerDataReportStruct.f155760e = C66800f.f191915c;
            finderPickerDataReportStruct.f155761f = 2;
            finderPickerDataReportStruct.mo76265s("search_icon");
            finderPickerDataReportStruct.f155763h = C66800f.f191916d;
            finderPickerDataReportStruct.mo76268v("");
            finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
            finderPickerDataReportStruct.mo86054n();
            StringBuilder sb = new StringBuilder();
            sb.append("report");
            sb.append(22878);
            sb.append(' ');
            String q = finderPickerDataReportStruct.mo1006q();
            C87412m.m108593f(q, "struct.toShowString()");
            sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
            Log.m105924i("FinderGalleryReportLogic", sb.toString());
            return true;
        }
    }

    /* renamed from: N7 */
    public final C66792b mo77411N7() {
        C66792b bVar = this.f158902q;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("galleryConfig");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.acc;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo77411N7().mo77484i(this, i, i2, intent, C66792b.C66794b.GALLERY);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C8808v4.class;
        super.onCreate(bundle);
        hideActionbarLine();
        setBackBtn(new C55806a(this));
        String stringExtra = getIntent().getStringExtra("TITLE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Log.m105924i(this.f158900o, "onCreate, title:" + stringExtra);
        boolean z = false;
        if (stringExtra.length() == 0) {
            setMMTitle((int) C0966R.string.eno);
        } else {
            setMMTitle(stringExtra);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.ehk);
        this.f158902q = C66792b.f191892b.mo90791a(getIntent());
        C87412m.m108593f(viewGroup, "coreRoot");
        this.f158901p = new C66795c(this, viewGroup, mo77411N7());
        if (mo77411N7().mo77478c()) {
            setActionbarColor(getResources().getColor(C0966R.color.f2953a_));
            viewGroup.setBackgroundColor(getResources().getColor(C0966R.color.f2953a_));
        }
        if (!((C8808v4) C86312j.m106911c(cls)).mo9635e()) {
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            if (!(oi12 != null && oi12.f139196d == 1)) {
                addIconOptionMenu(this.f158903r, -1, (int) C0966R.raw.icons_outlined_search, (MenuItem.OnMenuItemClickListener) new C55807b(this));
                if (mo77411N7().f191893a.f191888a.contains(5)) {
                    boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
                    boolean z2 = !((C75592q0.m90781k() & 34359738368L) != 0);
                    int q = C58784w3.m68441q(C58784w3.f168295a, (String) null, 1, (Object) null);
                    boolean e = ((C8808v4) C86312j.m106911c(cls)).mo9635e();
                    Log.m105924i(this.f158900o, "checkPermission show:" + sF + ", open:" + z2 + ", state:" + q + ", teenMode:" + e);
                    C37521f.f99374d.getClass();
                    int intValue = C37521f.f99139C1.mo60266n().intValue();
                    if (intValue == 1) {
                        sF = false;
                    } else if (intValue == 2) {
                        q = 1;
                    } else if (intValue == 3) {
                        z2 = false;
                    } else if (intValue == 4) {
                        e = true;
                    }
                    if (sF && z2 && ((q == 2 || q == 3) && !e)) {
                        z = true;
                    }
                    if (z) {
                        addIconOptionMenu(this.f158904s, -1, (int) C0966R.raw.icons_outlined_camera, (MenuItem.OnMenuItemClickListener) new C65697g0(this));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.m105924i(this.f158900o, "onCreate isTeenMode:" + ((C8808v4) C86312j.m106911c(cls)).mo9635e() + " isTeenModeAndViewAll:" + ((C8808v4) C86312j.m106911c(cls)).mo9636zX());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        r0 = r0.f43344d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r5 = this;
            zf1.c r0 = r5.f158901p
            if (r0 == 0) goto L_0x006c
            int r1 = r0.f191905i
            if (r1 < 0) goto L_0x0019
            java.lang.Class<lr.b> r1 = p599lr.C61381b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            lr.b r1 = (p599lr.C61381b) r1
            qo1.g r1 = r1.mo78545UQ()
            uq1.w r2 = r0.f191907k
            r1.mo12417j(r2)
        L_0x0019:
            zf1.f r1 = zf1.C66800f.f191913a
            java.util.ArrayList<zf1.i> r2 = r0.f191902f
            com.tencent.mm.plugin.finder.view.FinderViewPager r0 = r0.f191903g
            int r0 = r0.getCurrentItem()
            java.lang.Object r0 = sx3.C110818d0.m150917O(r2, r0)
            zf1.i r0 = (zf1.C16151i) r0
            if (r0 == 0) goto L_0x0032
            zf1.h r0 = r0.f43344d
            if (r0 == 0) goto L_0x0032
            int r0 = r0.f43342a
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct
            r2.<init>()
            java.lang.String r3 = zf1.C66800f.f191914b
            r2.mo76266t(r3)
            long r3 = zf1.C66800f.f191915c
            r2.f155760e = r3
            r3 = 3
            r2.f155761f = r3
            java.lang.String r3 = r1.mo90793a(r0)
            r2.mo76265s(r3)
            long r3 = r1.mo90794b(r0)
            r2.f155763h = r3
            java.lang.String r0 = ""
            r2.mo76268v(r0)
            long r3 = eb0.C31543z5.m39453c()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.mo76267u(r0)
            r2.mo86054n()
            r1.mo90800h(r2)
            super.onDestroy()
            return
        L_0x006c:
            java.lang.String r0 = "galleryCore"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGalleryUI.onDestroy():void");
    }
}
