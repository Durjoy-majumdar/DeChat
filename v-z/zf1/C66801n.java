package zf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPickerDataReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryFragment;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58684b;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import kf1.C9753h;
import nj3.C76912y0;
import o40.C61926c;
import p599lr.C61381b;
import z04.C112551y;

/* renamed from: zf1.n */
public class C66801n extends C9753h {

    /* renamed from: u */
    public final C66792b f191918u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66801n(MMActivity mMActivity, C66792b bVar, int i) {
        super(mMActivity, 0, 0, false, i);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(bVar, "galleryConfig");
        this.f191918u = bVar;
    }

    /* renamed from: F0 */
    public View mo9289F0() {
        return null;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        return this.f191918u.mo77479d(this.f30217g);
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f191918u.mo77480e(context, this.f30217g);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: O0 */
    public boolean mo10350O0() {
        return true;
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
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
                sb.append(", field_localFlag:");
                sb.append(baseFinderFeed.mo3513o().field_localFlag);
                Log.m105924i("Finder.FinderGalleryFragment", sb.toString());
                if (baseFinderFeed.mo3513o().isPostFinish()) {
                    if (this.f191918u.mo77477b()) {
                        Intent intent = new Intent();
                        BaseFeedLoader.saveCache$default(mo10348I0().f30175e, intent, c6, (C2780c) null, 4, (Object) null);
                        C66791a aVar = this.f191918u.f191893a;
                        int i3 = aVar.f191889b;
                        byte[] bArr = aVar.f191890c;
                        int i4 = this.f30217g;
                        intent.putExtra("BIZ_SCENE", i3);
                        intent.putExtra("EXT_BUFF", bArr);
                        intent.putExtra("TAB_TYPE", i4);
                        ((C58684b) C86312j.m106911c(C58684b.class)).hy0(this.f30214d, intent, this.f191918u.mo77481f());
                    } else {
                        C66792b bVar = this.f191918u;
                        MMActivity mMActivity = this.f30214d;
                        C87412m.m108592e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        bVar.mo77485j(mMActivity, this.f30217g, baseFinderFeed, mo10348I0().f30175e.getListOfType(BaseFinderFeed.class), mo10348I0().f30175e.getLastBuffer(), false);
                    }
                    long itemId = i2Var.getItemId();
                    boolean z = ((BaseFinderFeed) i2Var).mo3513o().getMediaType() == 2;
                    FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
                    finderPickerDataReportStruct.mo76266t(C66800f.f191914b);
                    finderPickerDataReportStruct.f155760e = C66800f.f191915c;
                    finderPickerDataReportStruct.f155761f = 2;
                    finderPickerDataReportStruct.mo76265s(z ? "pic_feed" : "vid_feed");
                    finderPickerDataReportStruct.f155763h = C66800f.f191916d;
                    finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(itemId) + "\"}");
                    finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
                    finderPickerDataReportStruct.mo86054n();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("report");
                    sb4.append(22878);
                    sb4.append(' ');
                    String q = finderPickerDataReportStruct.mo1006q();
                    C87412m.m108593f(q, "struct.toShowString()");
                    sb4.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                    Log.m105924i("FinderGalleryReportLogic", sb4.toString());
                } else if (baseFinderFeed.mo3513o().isPostFailed() && baseFinderFeed.mo3513o().isPostFailedCanRetry()) {
                    ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12413f(baseFinderFeed.mo3513o());
                } else if (!baseFinderFeed.mo3513o().isPostFailed()) {
                    MMActivity mMActivity2 = this.f30214d;
                    C76912y0.m92767f(mMActivity2, mMActivity2.getString(C0966R.string.f360755ej1));
                }
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: X0 */
    public boolean mo10354X0() {
        return this.f30217g == 5;
    }

    /* renamed from: d */
    public void mo9297d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9297d(arrayList);
        if (this.f191918u.mo77478c()) {
            TextView textView = (TextView) mo10357y(C0966R.C0970id.cj7);
            if (textView != null) {
                textView.setTextColor(this.f30214d.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            }
            TextView textView2 = (TextView) mo10357y(C0966R.C0970id.is_);
            if (textView2 != null) {
                textView2.setTextColor(this.f30214d.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            }
            TextView textView3 = (TextView) mo10357y(C0966R.C0970id.g2t);
            if (textView3 != null) {
                textView3.setTextColor(this.f30214d.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        View y = mo10357y(C0966R.C0970id.cjg);
        if (y instanceof View) {
            return y;
        }
        return null;
    }
}
