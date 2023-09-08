package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55011a;
import cm1.C55029s1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import ef1.C58556f;
import er1.C58684b;
import er1.C58784w3;
import f40.C86709a0;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import je1.C46547x1;
import je1.C60798d2;
import je1.C60806o3;
import kotlin.Metadata;
import lp3.C88643g;
import nj3.C76879j;
import nr3.C89059e;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p749xh.C66276va;
import pe1.C35464c;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49946j51;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;
import te3.C64793w23;
import uo3.C78253a;
import up1.C37521f;
import up1.C65415e0;
import up1.C65426w0;
import wp1.C66169h;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract;", "", "<init>", "()V", "MsgPresenter", "MsgViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract */
public final class FinderMsgContract {

    /* renamed from: a */
    public static final FinderMsgContract f160373a = new FinderMsgContract();

    /* renamed from: b */
    public static long f160374b = SystemClock.uptimeMillis();

    /* renamed from: c */
    public static final int f160375c = 20;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgPresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback;", "Lob0/n;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter */
    public static final class MsgPresenter implements C59264a<MsgViewCallback>, C11385n {

        /* renamed from: d */
        public final int f160376d;

        /* renamed from: e */
        public final int f160377e;

        /* renamed from: f */
        public final int[] f160378f;

        /* renamed from: g */
        public final String f160379g = ("Finder.FinderFinderMsgContract.MsgPresenter." + hashCode());

        /* renamed from: h */
        public MsgViewCallback f160380h;

        /* renamed from: i */
        public final ArrayList<C55011a> f160381i = new ArrayList<>();

        /* renamed from: j */
        public long f160382j;

        /* renamed from: n */
        public final String f160383n;

        /* renamed from: o */
        public long f160384o;

        /* renamed from: p */
        public final FinderMsgUIItemBrowseStruct f160385p;

        /* renamed from: q */
        public final FinderMsgContract$MsgPresenter$msgUpdateListener$1 f160386q;

        public MsgPresenter(int i, int i2, int[] iArr) {
            String O5;
            C87412m.m108594g(iArr, "msgTypes");
            this.f160376d = i;
            this.f160377e = i2;
            this.f160378f = iArr;
            String str = "";
            if (i == 1 && (O5 = C66785b.f191882e.mo90662O5()) != null) {
                str = O5;
            }
            this.f160383n = str;
            this.f160385p = new FinderMsgUIItemBrowseStruct();
            this.f160386q = new FinderMsgContract$MsgPresenter$msgUpdateListener$1(this, C40008f.f107254d);
        }

        /* renamed from: e */
        public final void mo78473e() {
            C86709a0.m107524d().mo123460f(new C60806o3(this.f160376d, this.f160377e, (String) null, 4, (C8480h) null));
            FinderMsgContract finderMsgContract = FinderMsgContract.f160373a;
            long uptimeMillis = SystemClock.uptimeMillis();
            finderMsgContract.getClass();
            FinderMsgContract.f160374b = uptimeMillis;
        }

        /* renamed from: n */
        public final int mo78474n(long j, int i, boolean z, boolean z2) {
            MsgViewCallback msgViewCallback = this.f160380h;
            if (msgViewCallback == null) {
                return -1;
            }
            ArrayList arrayList = new ArrayList();
            List<C66276va> b = C66169h.f190180a.mo90243b(j, i, this.f160378f, this.f160376d, this.f160383n);
            ArrayList<C55011a> arrayList2 = new ArrayList<>();
            for (C66276va i2 : b) {
                C55011a i3 = C66169h.f190180a.mo90250i(i2);
                if (i3 != null) {
                    arrayList2.add(i3);
                }
            }
            Log.m105924i(this.f160379g, "loadMoreData mentionId:" + j + " limit:" + i + " list:" + arrayList2.size());
            arrayList.addAll(arrayList2);
            long j2 = 0;
            if (this.f160376d == 1) {
                for (C55011a aVar : arrayList2) {
                    C66276va vaVar = aVar.f154465d;
                    long j3 = vaVar.field_id;
                    long j4 = this.f160382j;
                    if (j3 < j4 || j4 == 0) {
                        int i4 = vaVar.field_type;
                        if (i4 == 1) {
                            this.f160385p.f155728m++;
                        } else if (i4 == 2) {
                            this.f160385p.f155729n++;
                        } else if (i4 == 3) {
                            this.f160385p.f155730o++;
                        } else if (i4 == 5) {
                            this.f160385p.f155731p++;
                        }
                        this.f160385p.f155723h++;
                    } else {
                        int i5 = vaVar.field_type;
                        if (i5 == 1) {
                            this.f160385p.f155724i++;
                        } else if (i5 == 2) {
                            this.f160385p.f155725j++;
                        } else if (i5 == 3) {
                            this.f160385p.f155726k++;
                        } else if (i5 == 5) {
                            this.f160385p.f155727l++;
                        }
                        this.f160385p.f155722g++;
                    }
                    this.f160385p.f155721f++;
                }
            }
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = msgViewCallback.f160389f.f160381i.size();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                FinderMsgContract.f160373a.getClass();
                long j5 = uptimeMillis - FinderMsgContract.f160374b;
                C37521f.f99374d.getClass();
                C35464c<Long> cVar = C37521f.f99343Z1;
                if (j5 < cVar.mo60266n().longValue()) {
                    j2 = cVar.mo60266n().longValue() - j5;
                }
            }
            C61926c.m72666K(j2, new FinderMsgContract$MsgViewCallback$finishLoadMore$1(msgViewCallback, arrayList, z2, d0Var));
            return arrayList2.size();
        }

        public void onDetach() {
            this.f160386q.dead();
            if (this.f160376d == 1) {
                this.f160385p.mo86054n();
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(this.f160385p);
            }
            this.f160380h = null;
            String str = this.f160379g;
            Log.m105924i(str, "onDetach " + this.f160377e);
            C86709a0.m107524d().mo123470p(978, this);
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C60806o3) {
                String str2 = this.f160379g;
                StringBuilder sb = new StringBuilder();
                sb.append("errType ");
                sb.append(i);
                sb.append(", errCode ");
                sb.append(i2);
                sb.append(" errMsg ");
                sb.append(str);
                sb.append(" requestScene ");
                C60806o3 o3Var = (C60806o3) yVar;
                sb.append(o3Var.f173190i);
                Log.m105924i(str2, sb.toString());
                if (o3Var.f173191j != this.f160376d || this.f160377e != o3Var.f173190i) {
                    Log.m105928w(this.f160379g, "not my scene or type, ignore");
                } else if (i == 0 && i2 == 0) {
                    LinkedList<C66276va> linkedList = o3Var.f173192n;
                    C66276va vaVar = (C66276va) C110818d0.m150925W(linkedList);
                    long j = vaVar != null ? vaVar.field_id : 0;
                    String str3 = this.f160379g;
                    Log.m105924i(str3, "newUnreadMention " + j + ", unreadMention " + this.f160382j);
                    if (j > 0) {
                        long j2 = this.f160382j;
                        if (j2 == 0) {
                            this.f160382j = j;
                        } else if (j < j2) {
                            this.f160382j = j;
                        }
                    }
                    String str4 = this.f160379g;
                    Log.m105924i(str4, "unreadMention " + this.f160382j + " newMenList:" + linkedList.size());
                    mo78474n(MAlarmHandler.NEXT_FIRE_INTERVAL, linkedList.size(), true, true);
                } else {
                    MsgViewCallback msgViewCallback = this.f160380h;
                    if (msgViewCallback != null) {
                        FinderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1 finderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1 = new FinderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1(this.f160381i.isEmpty(), msgViewCallback);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        FinderMsgContract.f160373a.getClass();
                        long j3 = uptimeMillis - FinderMsgContract.f160374b;
                        C37521f fVar = C37521f.f99374d;
                        fVar.getClass();
                        C35464c<Long> cVar = C37521f.f99343Z1;
                        if (j3 >= cVar.mo60266n().longValue()) {
                            finderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1.run();
                            return;
                        }
                        fVar.getClass();
                        long longValue = cVar.mo60266n().longValue() - j3;
                        Pattern pattern = C61926c.f176038a;
                        MMHandlerThread.postToMainThreadDelayed(finderMsgContract$MsgPresenter$onSceneEnd$1$runnable$1, longValue);
                    }
                }
            }
        }

        /* renamed from: q */
        public void mo78475q(MsgViewCallback msgViewCallback) {
            C87412m.m108594g(msgViewCallback, "callback");
            this.f160386q.alive();
            this.f160380h = msgViewCallback;
            String str = this.f160379g;
            Log.m105924i(str, "onAttach " + this.f160377e);
            C86709a0.m107524d().mo123455a(978, this);
            if (this.f160376d == 1) {
                FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = this.f160385p;
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                if (Wb == null) {
                    Wb = "";
                }
                finderMsgUIItemBrowseStruct.f155719d = finderMsgUIItemBrowseStruct.mo86045b("SessionId", Wb, true);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgPresenter;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "UICallbackListener", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback */
    public static final class MsgViewCallback implements C8178c<MsgPresenter>, HeadFooterLayout.C57874a {

        /* renamed from: d */
        public final String f160387d = ("Finder.FinderMsgContract.MsgViewCallback." + hashCode());

        /* renamed from: e */
        public final int f160388e = 100;

        /* renamed from: f */
        public final MsgPresenter f160389f;

        /* renamed from: g */
        public final MMActivity f160390g;

        /* renamed from: h */
        public final View f160391h;

        /* renamed from: i */
        public RecyclerView f160392i;

        /* renamed from: j */
        public RefreshLoadMoreLayout f160393j;

        /* renamed from: n */
        public MMProcessBar f160394n;

        /* renamed from: o */
        public C78253a f160395o;

        /* renamed from: p */
        public TextView f160396p;

        /* renamed from: q */
        public WxRecyclerAdapter<C55011a> f160397q;

        /* renamed from: r */
        public C46547x1 f160398r;

        /* renamed from: s */
        public final UICallbackListener f160399s;

        /* renamed from: t */
        public C60798d2 f160400t;

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$UICallbackListener;", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$UICallbackListener */
        public interface UICallbackListener {
            /* renamed from: J */
            void mo78477J(C66276va vaVar);
        }

        public MsgViewCallback(MMActivity mMActivity, View view, MsgPresenter msgPresenter, UICallbackListener uICallbackListener) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(view, "msgView");
            C87412m.m108594g(msgPresenter, "presenter");
            this.f160389f = msgPresenter;
            this.f160390g = mMActivity;
            this.f160391h = view;
            this.f160399s = uICallbackListener;
        }

        /* renamed from: D */
        public static final void m64243D(MsgViewCallback msgViewCallback, C66276va vaVar) {
            MsgViewCallback msgViewCallback2 = msgViewCallback;
            C66276va vaVar2 = vaVar;
            msgViewCallback.getClass();
            C58784w3 w3Var = C58784w3.f168295a;
            int i = msgViewCallback2.f160389f.f160376d;
            w3Var.getClass();
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            int i2 = z ? 7 : 5;
            long j = vaVar2.field_objectId;
            String str = vaVar2.field_objectNonceId;
            int i3 = msgViewCallback2.f160389f.f160376d;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(msgViewCallback2.f160390g);
            C46547x1 x1Var = r3;
            C46547x1 x1Var2 = new C46547x1(j, str, i2, i3, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 122816, (C8480h) null);
            C46547x1 x1Var3 = x1Var;
            msgViewCallback2.f160398r = x1Var3;
            C89059e i4 = x1Var3.mo9225i();
            i4.mo11397F(msgViewCallback2.f160390g);
            i4.mo123062e(new FinderMsgContract$MsgViewCallback$getCommentDetail$1(msgViewCallback2, vaVar2, i2));
        }

        /* renamed from: Z */
        public static final void m64244Z(MsgViewCallback msgViewCallback, boolean z, FinderObject finderObject, long j) {
            String str;
            C13598b0 b0Var;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            C64417hb1 hb12;
            C64488kb1 kb12;
            C64417hb1 hb13;
            C64488kb1 kb13;
            C64417hb1 hb14;
            C64488kb1 kb14;
            C64417hb1 hb15;
            C64488kb1 kb15;
            C64417hb1 hb16;
            C64488kb1 kb16;
            C64417hb1 hb17;
            C64488kb1 kb17;
            C64417hb1 hb18;
            C64488kb1 kb18;
            C64417hb1 hb19;
            C64488kb1 kb19;
            C64417hb1 hb110;
            C64488kb1 kb110;
            C64417hb1 hb111;
            C64488kb1 kb111;
            C64417hb1 hb112;
            C64488kb1 kb112;
            C64417hb1 hb113;
            C64488kb1 kb113;
            C64417hb1 hb114;
            C64488kb1 kb114;
            C64417hb1 hb115;
            C64488kb1 kb115;
            C64519lb1 lb12;
            C64417hb1 hb116;
            C64488kb1 kb116;
            C64417hb1 hb117;
            C64488kb1 kb117;
            C64417hb1 hb118;
            C64488kb1 kb118;
            FinderObjectDesc finderObjectDesc;
            C64417hb1 hb119;
            C64488kb1 kb119;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            MsgViewCallback msgViewCallback2 = msgViewCallback;
            FinderObject finderObject2 = finderObject;
            msgViewCallback.getClass();
            FinderObjectDesc finderObjectDesc2 = finderObject2.objectDesc;
            if (finderObjectDesc2 == null || (linkedList = finderObjectDesc2.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
                str = null;
            } else {
                str = finderMedia.thumbUrl + finderMedia.thumb_url_token;
            }
            String str7 = "";
            if (!(!(str == null || str.length() == 0) || (finderObjectDesc = finderObject2.objectDesc) == null || (hb119 = finderObjectDesc.mvInfo) == null || (kb119 = hb119.f183456e) == null || (str = kb119.f183912o) != null)) {
                str = str7;
            }
            FinderContact finderContact = finderObject2.contact;
            String str8 = finderContact != null ? finderContact.nickname : null;
            C64719t23 t232 = new C64719t23();
            long j2 = finderObject2.f164794id;
            String str9 = finderObject2.objectNonceId;
            if (str == null || str8 == null || str9 == null) {
                b0Var = null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("key_mv_cover_url", str);
                intent.putExtra("key_mv_feed_id", C61926c.m72691p(j2));
                intent.putExtra("key_mv_nonce_id", str9);
                intent.putExtra("key_mv_poster", str8);
                intent.putExtra("key_launch_mv_comment", z);
                intent.putExtra("key_refer_mv_comment_id", j);
                intent.putExtra("key_need_update_music_ball_url", true);
                FinderObjectDesc finderObjectDesc3 = finderObject2.objectDesc;
                if (finderObjectDesc3 == null || (hb118 = finderObjectDesc3.mvInfo) == null || (kb118 = hb118.f183456e) == null || (str2 = kb118.f183916s) == null) {
                    str2 = str7;
                }
                intent.putExtra("key_mv_extra_info", str2);
                FinderObjectDesc finderObjectDesc4 = finderObject2.objectDesc;
                if (finderObjectDesc4 == null || (hb117 = finderObjectDesc4.mvInfo) == null || (kb117 = hb117.f183456e) == null || (str3 = kb117.f183917t) == null) {
                    str3 = str7;
                }
                intent.putExtra("key_mv_identification", str3);
                FinderObjectDesc finderObjectDesc5 = finderObject2.objectDesc;
                intent.putExtra("key_mv_music_duration", (finderObjectDesc5 == null || (hb116 = finderObjectDesc5.mvInfo) == null || (kb116 = hb116.f183456e) == null) ? 0 : kb116.f183918u);
                FinderObjectDesc finderObjectDesc6 = finderObject2.objectDesc;
                if (finderObjectDesc6 == null || (hb115 = finderObjectDesc6.mvInfo) == null || (kb115 = hb115.f183456e) == null || (lb12 = kb115.f183921x) == null || (str4 = lb12.f184069d) == null) {
                    str4 = str7;
                }
                intent.putExtra("key_mv_music_operation_url", str4);
                FinderObjectDesc finderObjectDesc7 = finderObject2.objectDesc;
                if (finderObjectDesc7 == null || (hb114 = finderObjectDesc7.mvInfo) == null || (kb114 = hb114.f183456e) == null || (str5 = kb114.f183922y) == null) {
                    str5 = str7;
                }
                intent.putExtra("key_mv_song_mid", str5);
                t232.f185459d = C61926c.m72691p(j2);
                t232.f185460e = str9;
                t232.f185461f = str;
                t232.f185462g = str8;
                FinderObjectDesc finderObjectDesc8 = finderObject2.objectDesc;
                t232.f185463h = (finderObjectDesc8 == null || (hb113 = finderObjectDesc8.mvInfo) == null || (kb113 = hb113.f183456e) == null) ? null : kb113.f183905e;
                t232.f185464i = (finderObjectDesc8 == null || (hb112 = finderObjectDesc8.mvInfo) == null || (kb112 = hb112.f183456e) == null) ? null : kb112.f183911n;
                t232.f185465j = (finderObjectDesc8 == null || (hb111 = finderObjectDesc8.mvInfo) == null || (kb111 = hb111.f183456e) == null) ? null : kb111.f183916s;
                t232.f185466n = (finderObjectDesc8 == null || (hb110 = finderObjectDesc8.mvInfo) == null || (kb110 = hb110.f183456e) == null) ? null : kb110.f183913p;
                t232.f185467o = (finderObjectDesc8 == null || (hb19 = finderObjectDesc8.mvInfo) == null || (kb19 = hb19.f183456e) == null) ? 0 : kb19.f183915r;
                t232.f185468p = (finderObjectDesc8 == null || (hb18 = finderObjectDesc8.mvInfo) == null || (kb18 = hb18.f183456e) == null) ? null : kb18.f183905e;
                t232.f185469q = (finderObjectDesc8 == null || (hb17 = finderObjectDesc8.mvInfo) == null || (kb17 = hb17.f183456e) == null) ? 0 : kb17.f183918u;
                t232.f185473u = (finderObjectDesc8 == null || (hb16 = finderObjectDesc8.mvInfo) == null || (kb16 = hb16.f183456e) == null) ? null : kb16.f183904d;
                t232.f185474v = (finderObjectDesc8 == null || (hb15 = finderObjectDesc8.mvInfo) == null || (kb15 = hb15.f183456e) == null) ? null : kb15.f183910j;
                t232.f185475w = (finderObjectDesc8 == null || (hb14 = finderObjectDesc8.mvInfo) == null || (kb14 = hb14.f183456e) == null) ? null : kb14.f183912o;
                if (finderObjectDesc8 == null || (hb13 = finderObjectDesc8.mvInfo) == null || (kb13 = hb13.f183456e) == null || (str6 = kb13.f183922y) == null) {
                    str6 = str7;
                }
                t232.f185470r = str6;
                t232.f185472t = str;
                Log.m105924i(msgViewCallback2.f160387d, "jump to musicMvMainUI");
                FinderObjectDesc finderObjectDesc9 = finderObject2.objectDesc;
                if (!(finderObjectDesc9 == null || (hb12 = finderObjectDesc9.mvInfo) == null || (kb12 = hb12.f183456e) == null)) {
                    C65415e0.f188260a.mo89507e(kb12, C61926c.m72691p(finderObject2.f164794id), 13, t232);
                }
                C64793w23 w232 = new C64793w23();
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "randomUUID().toString()");
                w232.f186034e = uuid;
                w232.f186035f = 86;
                w232.f186036g = C61926c.m72691p(finderObject2.f164794id);
                w232.f186033d = 5;
                w232.f186038i = ((C13442s8) C39818r.f106831a.mo62444c(msgViewCallback2.f160390g).mo75002a(C13442s8.class)).f38098n;
                intent.putExtra("key_mv_report_data", w232.toByteArray());
                String str10 = t232.f185473u;
                if (str10 == null) {
                    str10 = str7;
                }
                intent.putExtra("key_mv_song_name", str10);
                String str11 = t232.f185474v;
                if (str11 == null) {
                    str11 = str7;
                }
                intent.putExtra("key_mv_song_lyric", str11);
                String str12 = t232.f185463h;
                if (str12 == null) {
                    str12 = str7;
                }
                intent.putExtra("key_mv_singer_name", str12);
                String str13 = t232.f185464i;
                if (str13 == null) {
                    str13 = str7;
                }
                intent.putExtra("key_mv_album_name", str13);
                String str14 = t232.f185466n;
                if (str14 == null) {
                    str14 = str7;
                }
                intent.putExtra("key_mv_music_genre", str14);
                intent.putExtra("key_mv_issue_date", String.valueOf(t232.f185467o));
                String str15 = t232.f185475w;
                if (str15 == null) {
                    str15 = str7;
                }
                intent.putExtra("key_mv_album_cover_url", str15);
                String str16 = t232.f185468p;
                if (str16 == null) {
                    str16 = str7;
                }
                intent.putExtra("key_mv_identification", str16);
                String str17 = t232.f185465j;
                if (str17 != null) {
                    str7 = str17;
                }
                intent.putExtra("key_mv_extra_info", str7);
                intent.putExtra("key_mv_music_duration", t232.f185469q);
                intent.putExtra("key_mv_music_operation_url", t232.f185471s);
                intent.putExtra("key_mv_song_mid", t232.f185470r);
                ((C58684b) C86312j.m106911c(C58684b.class)).jy0(msgViewCallback2.f160390g, intent);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i(msgViewCallback2.f160387d, "jump to musicMvMainUI error " + str + ' ' + str8 + ' ' + finderObject2.f164794id + ' ' + finderObject2.objectNonceId);
            }
        }

        /* renamed from: y */
        public static final void m64245y(MsgViewCallback msgViewCallback, int i) {
            switch (i) {
                case -8003:
                    C76879j.m92738i(msgViewCallback.f160390g, C0966R.string.eoh, 0);
                    return;
                case -8002:
                    C76879j.m92738i(msgViewCallback.f160390g, C0966R.string.d_8, 0);
                    return;
                case -8001:
                    C76879j.m92738i(msgViewCallback.f160390g, C0966R.string.f360503d90, 0);
                    return;
                default:
                    msgViewCallback.getClass();
                    return;
            }
        }

        /* renamed from: a */
        public final void mo78476a() {
            C58556f j3;
            this.f160395o = new C78253a(this.f160390g);
            View findViewById = this.f160391h.findViewById(C0966R.C0970id.ivb);
            C87412m.m108593f(findViewById, "contentView.findViewById(R.id.rl_layout)");
            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
            this.f160393j = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setLimitTopRequest(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f160393j;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)));
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f160393j;
                if (refreshLoadMoreLayout3 != null) {
                    refreshLoadMoreLayout3.setDamping(1.85f);
                    View findViewById2 = this.f160391h.findViewById(C0966R.C0970id.ive);
                    C87412m.m108593f(findViewById2, "contentView.findViewById…ar>(R.id.rl_loading_icon)");
                    this.f160394n = (MMProcessBar) findViewById2;
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f160393j;
                    if (refreshLoadMoreLayout4 != null) {
                        this.f160392i = refreshLoadMoreLayout4.getRecyclerView();
                        View findViewById3 = this.f160391h.findViewById(C0966R.C0970id.h2c);
                        C87412m.m108593f(findViewById3, "contentView.findViewById(R.id.msg_refresh_tip)");
                        this.f160396p = (TextView) findViewById3;
                        RecyclerView recyclerView = this.f160392i;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(this.f160390g));
                            TextView textView = this.f160396p;
                            if (textView != null) {
                                textView.setOnClickListener(new FinderMsgContract$MsgViewCallback$initView$1(this));
                                FinderMsgContract$MsgViewCallback$initView$2 finderMsgContract$MsgViewCallback$initView$2 = new FinderMsgContract$MsgViewCallback$initView$2(this);
                                MsgPresenter msgPresenter = this.f160389f;
                                ArrayList<C55011a> arrayList = msgPresenter.f160381i;
                                if (msgPresenter.f160376d == 1 && msgPresenter.f160377e == 1) {
                                    C66276va vaVar = new C66276va();
                                    vaVar.field_id = MAlarmHandler.NEXT_FIRE_INTERVAL;
                                    vaVar.field_createTime = Integer.MAX_VALUE;
                                    arrayList.add(0, new C55029s1(vaVar));
                                }
                                WxRecyclerAdapter<C55011a> wxRecyclerAdapter = new WxRecyclerAdapter<>(finderMsgContract$MsgViewCallback$initView$2, arrayList, true);
                                this.f160397q = wxRecyclerAdapter;
                                wxRecyclerAdapter.f165737C = new FinderMsgContract$MsgViewCallback$initView$4(this);
                                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f160390g);
                                if (!(f == null || (j3 = f.mo12854j3(-1)) == null)) {
                                    RecyclerView recyclerView2 = this.f160392i;
                                    if (recyclerView2 != null) {
                                        j3.mo83455c(recyclerView2);
                                    } else {
                                        C87412m.m108603p("recyclerView");
                                        throw null;
                                    }
                                }
                                RecyclerView recyclerView3 = this.f160392i;
                                if (recyclerView3 != null) {
                                    recyclerView3.setAdapter(this.f160397q);
                                    WxRecyclerAdapter<C55011a> wxRecyclerAdapter2 = this.f160397q;
                                    if (wxRecyclerAdapter2 != null) {
                                        wxRecyclerAdapter2.f173488o = new FinderMsgContract$MsgViewCallback$initView$5(this);
                                    }
                                    if (wxRecyclerAdapter2 != null) {
                                        wxRecyclerAdapter2.f173487n = new FinderMsgContract$MsgViewCallback$initView$6(this);
                                    }
                                    RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f160393j;
                                    if (refreshLoadMoreLayout5 != null) {
                                        refreshLoadMoreLayout5.setOverCallback(this);
                                        RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f160393j;
                                        if (refreshLoadMoreLayout6 != null) {
                                            refreshLoadMoreLayout6.setActionCallback(new FinderMsgContract$MsgViewCallback$initView$7(this));
                                            Pattern pattern = C61926c.f176038a;
                                            C61926c.m72701z(C88643g.m110546d(), new FinderMsgContract$MsgViewCallback$initView$8(this));
                                            C61926c.m72666K(300, new FinderMsgContract$MsgViewCallback$initView$9(this));
                                            return;
                                        }
                                        C87412m.m108603p("rlLayout");
                                        throw null;
                                    }
                                    C87412m.m108603p("rlLayout");
                                    throw null;
                                }
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                            C87412m.m108603p("refreshTip");
                            throw null;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }

        public MMFragmentActivity getActivity() {
            return this.f160390g;
        }

        /* renamed from: p */
        public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
            String str = this.f160387d;
            Log.m105924i(str, "[onOverEnd] dy=" + i2);
            return false;
        }

        /* renamed from: v */
        public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
            String str = this.f160387d;
            Log.m105924i(str, "[onOverStart] dy=" + i2);
            MMProcessBar mMProcessBar = this.f160394n;
            if (mMProcessBar != null) {
                mMProcessBar.mo82301a(((float) i2) / ((float) ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3733cm))));
                return false;
            }
            C87412m.m108603p("rlProcessBar");
            throw null;
        }

        /* renamed from: x */
        public void mo3720x(int i) {
            Log.m105924i(this.f160387d, "[onOverStop]");
            MMProcessBar mMProcessBar = this.f160394n;
            if (mMProcessBar != null) {
                mMProcessBar.mo82303c();
            } else {
                C87412m.m108603p("rlProcessBar");
                throw null;
            }
        }
    }

    private FinderMsgContract() {
    }
}
