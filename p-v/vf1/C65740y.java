package vf1;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPickerDataReportStruct;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryFragment;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58684b;
import er1.C58784w3;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import o40.C61926c;
import pe3.C89349b;
import rs1.C13442s8;
import sx3.C110818d0;
import sx3.C13798c0;
import z04.C112551y;
import zf1.C66792b;
import zf1.C66800f;

/* renamed from: vf1.y */
public final class C65740y implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderGallerySearchUI f189118d;

    public C65740y(FinderGallerySearchUI finderGallerySearchUI) {
        this.f189118d = finderGallerySearchUI;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        RecyclerView.C16613e eVar2 = eVar;
        Class<BaseFinderFeed> cls = BaseFinderFeed.class;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < this.f189118d.f158889v.size()) {
            C0740i2 i2Var = (C0740i2) C110818d0.m150917O(this.f189118d.f158889v, c6);
            if (i2Var instanceof BaseFinderFeed) {
                int i2 = FinderGalleryFragment.f159143y;
                StringBuilder sb = new StringBuilder();
                sb.append("onClick ");
                sb.append(c6);
                sb.append(" id:");
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                sb.append(baseFinderFeed.mo3513o().getId());
                sb.append(", pos:");
                sb.append(c6);
                Log.m105924i("Finder.FinderGalleryFragment", sb.toString());
                FinderGallerySearchUI finderGallerySearchUI = this.f189118d;
                String p = C61926c.m72691p(baseFinderFeed.getItemId());
                finderGallerySearchUI.getClass();
                Class cls2 = C58417y0.class;
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                String str = finderGallerySearchUI.f158890w;
                String str2 = finderGallerySearchUI.f158885r;
                String str3 = ((C58417y0) C86312j.m106911c(cls2)).f167351e;
                int i3 = finderGallerySearchUI.f158891x;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(finderGallerySearchUI);
                int i4 = c6;
                Class<BaseFinderFeed> cls3 = cls;
                C58417y0.cy0(y0Var, str, str2, 2, 2, p, i, 3, 1, str3, 2, i3, f != null ? f.mo12861q3() : null, (String) null, 0, 12288, (Object) null);
                long itemId = baseFinderFeed.getItemId();
                boolean z = baseFinderFeed.mo3513o().getMediaType() == 2;
                String str4 = this.f189118d.f158885r;
                int i5 = i + 1;
                C66800f.f191917e = str4 == null ? "" : str4;
                FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
                finderPickerDataReportStruct.mo76266t(C66800f.f191914b);
                finderPickerDataReportStruct.f155760e = C66800f.f191915c;
                finderPickerDataReportStruct.f155761f = 5;
                finderPickerDataReportStruct.mo76265s(z ? "pic_feed" : "vid_feed");
                finderPickerDataReportStruct.f155763h = 6;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("{\"feedid\":\"");
                sb4.append(C61926c.m72691p(itemId));
                sb4.append("\";\"feed_position\":\"");
                sb4.append(i5);
                sb4.append("\";\"keyword\":\"");
                if (str4 == null) {
                    str4 = "";
                }
                sb4.append(str4);
                sb4.append("\"}");
                finderPickerDataReportStruct.mo76268v(sb4.toString());
                finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
                finderPickerDataReportStruct.mo86054n();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("report");
                sb5.append(22878);
                sb5.append(' ');
                String q = finderPickerDataReportStruct.mo1006q();
                C87412m.m108593f(q, "struct.toShowString()");
                sb5.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                Log.m105924i("FinderGalleryReportLogic", sb5.toString());
                if (this.f189118d.mo77408N7().mo77477b()) {
                    Intent intent = new Intent();
                    C58784w3.m68427B1(C58784w3.f168295a, i4, C13798c0.m13102z(this.f189118d.f158889v, cls3), this.f189118d.f158888u, intent, (C2780c) null, 16, (Object) null);
                    int i6 = this.f189118d.mo77408N7().f191893a.f191889b;
                    byte[] bArr = this.f189118d.mo77408N7().f191893a.f191890c;
                    int i7 = this.f189118d.f158880H;
                    intent.putExtra("BIZ_SCENE", i6);
                    intent.putExtra("EXT_BUFF", bArr);
                    intent.putExtra("TAB_TYPE", i7);
                    FinderGallerySearchUI finderGallerySearchUI2 = this.f189118d;
                    ((C58684b) C86312j.m106911c(C58684b.class)).hy0(finderGallerySearchUI2, intent, finderGallerySearchUI2.mo77408N7().mo77481f());
                    return;
                }
                C66792b N7 = this.f189118d.mo77408N7();
                FinderGallerySearchUI finderGallerySearchUI3 = this.f189118d;
                N7.mo77485j(finderGallerySearchUI3, finderGallerySearchUI3.f158880H, baseFinderFeed, C13798c0.m13102z(finderGallerySearchUI3.f158889v, cls3), (C89349b) null, true);
            }
        }
    }
}
