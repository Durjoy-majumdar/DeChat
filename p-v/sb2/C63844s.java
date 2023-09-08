package sb2;

import a14.C53934p0;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import di3.C86312j;
import dp1.C58408t0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.UUID;
import jb2.C60791k;
import p529fv.C59330q;
import p529fv.C59331r;
import p640ox.C77049b;
import p749xh.C102658n6;
import pb0.C47446b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64550mb1;
import te3.C64619p13;
import te3.C64621p23;
import te3.C64793w23;
import wb2.C65946a;
import wx3.C15601d;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: sb2.s */
public final class C63844s extends UIComponent {

    /* renamed from: d */
    public C102658n6 f180974d;

    /* renamed from: e */
    public C64488kb1 f180975e = new C64488kb1();

    /* renamed from: f */
    public final C54219z<C64621p23> f180976f;

    /* renamed from: g */
    public LiveData<C64621p23> f180977g;

    /* renamed from: h */
    public C64621p23 f180978h;

    /* renamed from: i */
    public int f180979i;

    /* renamed from: j */
    public final C13601g f180980j;

    /* renamed from: sb2.s$a */
    public static final class C36651a extends C87413o implements C32224a<C54219z<Integer>> {

        /* renamed from: d */
        public static final C36651a f97415d = new C36651a();

        public C36651a() {
            super(0);
        }

        public Object invoke() {
            C54219z zVar = new C54219z();
            zVar.setValue(1);
            return zVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63844s(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C54219z<C64621p23> zVar = new C54219z<>();
        this.f180976f = zVar;
        this.f180977g = zVar;
        this.f180978h = new C64621p23();
        this.f180979i = 3;
        this.f180980j = C36568h.m40985a(C36651a.f97415d);
    }

    /* renamed from: c3 */
    public final C54219z<Integer> mo88633c3() {
        return (C54219z) ((C36570n) this.f180980j).getValue();
    }

    /* renamed from: d3 */
    public final boolean mo88634d3() {
        Integer value = mo88633c3().getValue();
        return value != null && value.intValue() == 1;
    }

    /* renamed from: e3 */
    public final void mo88635e3(boolean z) {
        FinderObject finderObject;
        FinderObjectDesc finderObjectDesc;
        C64417hb1 hb12;
        LinkedList<C64550mb1> linkedList;
        MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
        Activity context = getContext();
        C64488kb1 kb12 = this.f180975e;
        C64621p23 p232 = this.f180978h;
        int i = this.f180979i;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kb12, "songInfo");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 7, C64793w23.class);
        MvCreateActionStruct mvCreateActionStruct = new MvCreateActionStruct();
        MvCreateReportHelper.f163006b = mvCreateActionStruct;
        if (w232 != null) {
            mvCreateActionStruct.f156545d = mvCreateActionStruct.mo86045b("ContextId", w232.f186034e, true);
            MvCreateActionStruct mvCreateActionStruct2 = MvCreateReportHelper.f163006b;
            mvCreateActionStruct2.f156538B = (long) w232.f186033d;
            mvCreateActionStruct2.f156556o = mvCreateActionStruct2.mo86045b("FinderSessionId", w232.f186038i, true);
        }
        MvCreateActionStruct mvCreateActionStruct3 = MvCreateReportHelper.f163006b;
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        mvCreateActionStruct3.f156546e = mvCreateActionStruct3.mo86045b("CreateContextId", uuid, true);
        MvCreateActionStruct mvCreateActionStruct4 = MvCreateReportHelper.f163006b;
        String str = kb12.f183904d;
        String str2 = null;
        mvCreateActionStruct4.f156547f = mvCreateActionStruct4.mo86045b("SongName", str != null ? C112551y.m153814n(str, ",", " ", false) : null, true);
        MvCreateActionStruct mvCreateActionStruct5 = MvCreateReportHelper.f163006b;
        mvCreateActionStruct5.f156548g = mvCreateActionStruct5.mo86045b("SongId", kb12.f183909i, true);
        MvCreateActionStruct mvCreateActionStruct6 = MvCreateReportHelper.f163006b;
        mvCreateActionStruct6.f156549h = mvCreateActionStruct6.mo86045b("WebUrl", kb12.f183908h, true);
        MvCreateActionStruct mvCreateActionStruct7 = MvCreateReportHelper.f163006b;
        mvCreateActionStruct7.f156550i = mvCreateActionStruct7.mo86045b("DataUrl", kb12.f183906f, true);
        MvCreateActionStruct mvCreateActionStruct8 = MvCreateReportHelper.f163006b;
        String str3 = kb12.f183905e;
        if (str3 != null) {
            str2 = C112551y.m153814n(str3, ",", " ", false);
        }
        mvCreateActionStruct8.f156551j = mvCreateActionStruct8.mo86045b("Singer", str2, true);
        MvCreateActionStruct mvCreateActionStruct9 = MvCreateReportHelper.f163006b;
        String O5 = C66785b.f191882e.mo90662O5();
        if (O5 == null) {
            O5 = "";
        }
        mvCreateActionStruct9.f156554m = mvCreateActionStruct9.mo86045b("MvUserId", O5, true);
        MvCreateReportHelper.f163006b.f156564w = (p232 == null || (finderObject = p232.f184739d) == null || (finderObjectDesc = finderObject.objectDesc) == null || (hb12 = finderObjectDesc.mvInfo) == null || (linkedList = hb12.f183455d) == null) ? 0 : (long) linkedList.size();
        MvCreateActionStruct mvCreateActionStruct10 = MvCreateReportHelper.f163006b;
        mvCreateActionStruct10.f156538B = (long) i;
        mvCreateActionStruct10.f156540D = z ? 1 : 2;
        MvCreateActionStruct c = mvCreateReportHelper.mo80352c();
        c.f156552k = 1;
        c.mo86054n();
        c.mo86056r();
    }

    public void onCreate(Bundle bundle) {
        FinderObjectDesc finderObjectDesc;
        C64417hb1 hb12;
        C64488kb1 kb12;
        FinderObjectDesc finderObjectDesc2;
        C64417hb1 hb13;
        C64488kb1 kb13;
        FinderObjectDesc finderObjectDesc3;
        C64417hb1 hb14;
        C64488kb1 kb14;
        FinderObjectDesc finderObjectDesc4;
        C64417hb1 hb15;
        C64488kb1 kb15;
        super.onCreate(bundle);
        C102658n6 bp = ((C59330q) C86312j.m106911c(C59330q.class)).mo84438bp(getActivity());
        this.f180974d = bp;
        String str = "";
        if (bp != null) {
            C64488kb1 kb16 = this.f180975e;
            C87412m.m108594g(kb16, "songInfo");
            kb16.f183904d = bp.field_songName;
            kb16.f183905e = bp.field_songSinger;
            kb16.f183908h = bp.field_songWebUrl;
            kb16.f183907g = bp.field_appId;
            kb16.f183906f = bp.field_songWifiUrl;
            kb16.f183912o = bp.field_songHAlbumUrl;
            kb16.f183910j = bp.field_songLyric;
            kb16.f183909i = str;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            this.f180978h.parseFrom(byteArrayExtra);
        }
        C64621p23 p232 = this.f180978h;
        FinderObject finderObject = p232.f184739d;
        if (!(finderObject == null || (finderObjectDesc4 = finderObject.objectDesc) == null || (hb15 = finderObjectDesc4.mvInfo) == null || (kb15 = hb15.f183456e) == null)) {
            this.f180975e = kb15;
        }
        C102658n6 n6Var = this.f180974d;
        String str2 = null;
        boolean z = false;
        if (n6Var != null) {
            String str3 = n6Var.field_songHAlbumUrl;
            if (str3 == null || str3.length() == 0) {
                FinderObject finderObject2 = p232.f184739d;
                n6Var.field_songHAlbumUrl = (finderObject2 == null || (finderObjectDesc3 = finderObject2.objectDesc) == null || (hb14 = finderObjectDesc3.mvInfo) == null || (kb14 = hb14.f183456e) == null) ? null : kb14.f183912o;
            }
            String str4 = n6Var.field_songLyric;
            if (str4 == null || str4.length() == 0) {
                FinderObject finderObject3 = p232.f184739d;
                n6Var.field_songLyric = (finderObject3 == null || (finderObjectDesc2 = finderObject3.objectDesc) == null || (hb13 = finderObjectDesc2.mvInfo) == null || (kb13 = hb13.f183456e) == null) ? null : kb13.f183910j;
            }
        }
        this.f180979i = getIntent().getIntExtra("key_mv_enter_maker_ui_from_scene", 3);
        if (this.f180978h.f184745j <= 0 && ((C59331r) C86312j.m106911c(C59331r.class)).mo84023QS()) {
            C64621p23 p233 = this.f180978h;
            p233.f184745j = 8192;
            FinderObject finderObject4 = p233.f184739d;
            if (!(finderObject4 == null || (finderObjectDesc = finderObject4.objectDesc) == null || (hb12 = finderObjectDesc.mvInfo) == null || (kb12 = hb12.f183456e) == null)) {
                Log.m105924i("MicroMsg.Mv.MusicMvMakerDataUIC", "syncBeatTrack duration:" + kb12.f183918u);
                C64619p13 p132 = new C64619p13();
                p132.f184728d = kb12.f183909i;
                p132.f184729e = kb12.f183904d;
                p132.f184730f = kb12.f183905e;
                p132.f184732h = kb12.f183906f;
                p132.f184731g = kb12.f183908h;
                p132.f184733i = kb12.f183918u;
                p132.f184734j = kb12;
                C45252f a = C47446b.f127269a.mo72464a(C60791k.f173145r.mo85723a(p132));
                C39622i0 a2 = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C65946a.class);
                C87412m.m108593f(a2, "UICProvider.of(activity)…ycleScopeUIC::class.java)");
                LifecycleScope.launchDefault$default(((C65946a) a2).mo89983c3(), (C53934p0) null, new C48370t(a, this, (C15601d<? super C48370t>) null), 1, (Object) null);
            }
        }
        this.f180976f.postValue(this.f180978h);
        C58408t0 t0Var = C58408t0.f167336a;
        if (this.f180978h.f184743h != 0) {
            z = true;
        }
        t0Var.mo83266l(10, z);
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.musicType = 5;
        }
        C102658n6 n6Var2 = this.f180974d;
        if (n6Var2 != null) {
            str2 = n6Var2.field_musicId;
        }
        if (str2 != null) {
            str = str2;
        }
        if (finderFeedReportObject != null) {
            finderFeedReportObject.videoMusicId = str;
        }
        if (finderFeedReportObject != null) {
            finderFeedReportObject.draftType = 2;
        }
        long j = this.f180978h.f184743h;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.draftId = (int) j;
        }
    }
}
