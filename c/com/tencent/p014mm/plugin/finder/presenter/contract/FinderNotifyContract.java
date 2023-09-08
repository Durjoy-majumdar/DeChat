package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct;
import com.tencent.p014mm.p136ui.C85868k2;
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
import ef1.C58556f;
import er1.C58684b;
import er1.C58784w3;
import f40.C86709a0;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import je1.C46547x1;
import je1.C60798d2;
import je1.C60806o3;
import kotlin.Metadata;
import lp3.C88643g;
import nj3.C76879j;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p749xh.C66276va;
import pe1.C35464c;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C64197v;
import te3.C49946j51;
import te3.C64392gc1;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;
import te3.C64793w23;
import tq1.C64996a;
import uo3.C78253a;
import up1.C37521f;
import up1.C65415e0;
import up1.C65426w0;
import zc1.C66785b;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract;", "", "<init>", "()V", "NotifyPresenter", "NotifyViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract */
public final class FinderNotifyContract {

    /* renamed from: a */
    public static final FinderNotifyContract f160438a = new FinderNotifyContract();

    /* renamed from: b */
    public static final ArrayList<Long> f160439b = new ArrayList<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyPresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback;", "Lob0/n;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter */
    public static final class NotifyPresenter implements C59264a<NotifyViewCallback>, C11385n {

        /* renamed from: d */
        public final int f160440d;

        /* renamed from: e */
        public final int[] f160441e;

        /* renamed from: f */
        public final ArrayList<int[]> f160442f;

        /* renamed from: g */
        public final String f160443g = ("Finder.NotifyPresenter." + hashCode());

        /* renamed from: h */
        public final List<Boolean> f160444h = new ArrayList();

        /* renamed from: i */
        public final ConcurrentHashMap<Integer, Long> f160445i = new ConcurrentHashMap<>();

        /* renamed from: j */
        public long f160446j;

        /* renamed from: n */
        public ArrayList<NotifyViewCallback> f160447n = new ArrayList<>();

        /* renamed from: o */
        public final ArrayList<ArrayList<C55011a>> f160448o = new ArrayList<>();

        /* renamed from: p */
        public final FinderMsgUIItemBrowseStruct f160449p = new FinderMsgUIItemBrowseStruct();

        /* renamed from: q */
        public final String f160450q;

        /* renamed from: r */
        public final FinderNotifyContract$NotifyPresenter$msgUpdateListener$1 f160451r;

        public NotifyPresenter(int i, int[] iArr, ArrayList<int[]> arrayList) {
            String O5;
            C87412m.m108594g(iArr, "requestScenes");
            C87412m.m108594g(arrayList, "msgTypes");
            this.f160440d = i;
            this.f160441e = iArr;
            this.f160442f = arrayList;
            String str = "";
            if (i == 1 && (O5 = C66785b.f191882e.mo90662O5()) != null) {
                str = O5;
            }
            this.f160450q = str;
            this.f160451r = new FinderNotifyContract$NotifyPresenter$msgUpdateListener$1(this, C40008f.f107254d);
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                this.f160448o.add(new ArrayList());
                this.f160444h.add(Boolean.FALSE);
            }
            for (T next : this.f160448o) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    String str2 = this.f160443g;
                    Log.m105924i(str2, "init containerList: item[" + i2 + "]: " + ((ArrayList) next).hashCode());
                    i2 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }

        /* renamed from: e */
        public final void mo78484e(int i) {
            C89137b0 d = C86709a0.m107524d();
            int i2 = this.f160440d;
            boolean z = true;
            C60806o3 o3Var = new C60806o3(i2, this.f160441e[i], i2 == 1 ? this.f160450q : "");
            o3Var.f173193o = i;
            d.mo123460f(o3Var);
            FinderNotifyContract finderNotifyContract = FinderNotifyContract.f160438a;
            long uptimeMillis = SystemClock.uptimeMillis();
            finderNotifyContract.getClass();
            ArrayList<Long> arrayList = FinderNotifyContract.f160439b;
            if (i < 0 || i >= arrayList.size()) {
                z = false;
            }
            if ((z ? arrayList : null) != null) {
                arrayList.set(i, Long.valueOf(uptimeMillis));
            }
        }

        /* renamed from: n */
        public final ArrayList<C55011a> mo78485n(int i) {
            ArrayList<ArrayList<C55011a>> arrayList = this.f160448o;
            ArrayList<C55011a> arrayList2 = null;
            if (!(i >= 0 && i < arrayList.size())) {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2 = this.f160448o.get(i);
            }
            return arrayList2 == null ? new ArrayList<>() : arrayList2;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            long j;
            C66276va vaVar;
            if (yVar instanceof C60806o3) {
                C60806o3 o3Var = (C60806o3) yVar;
                int i4 = o3Var.f173190i;
                int i5 = o3Var.f173193o;
                String str2 = this.f160443g;
                Log.m105924i(str2, "errType " + i + ", errCode " + i2 + " errMsg " + str + " requestScene " + i4);
                if (i4 != 1) {
                    int[] iArr = this.f160441e;
                    int length = iArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i3 = -1;
                            break;
                        }
                        int i8 = i6 + 1;
                        if (i4 == iArr[i7]) {
                            i3 = i6;
                            break;
                        } else {
                            i7++;
                            i6 = i8;
                        }
                    }
                } else {
                    i3 = i5;
                }
                if (o3Var.f173191j != this.f160440d || i3 < 0) {
                    Log.m105928w(this.f160443g, "not my scene or type, ignore");
                } else if (i == 0 && i2 == 0) {
                    LinkedList<C66276va> linkedList = o3Var.f173192n;
                    if (linkedList != null) {
                        ListIterator<C66276va> listIterator = linkedList.listIterator(linkedList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                vaVar = null;
                                break;
                            }
                            vaVar = listIterator.previous();
                            int[] iArr2 = this.f160442f.get(i3);
                            C87412m.m108593f(iArr2, "msgTypes[index]");
                            if (C110823p.m151008x(iArr2, vaVar.field_type)) {
                                break;
                            }
                        }
                        C66276va vaVar2 = vaVar;
                        if (vaVar2 != null) {
                            if (this.f160445i.containsKey(Integer.valueOf(i3))) {
                                Long l = this.f160445i.get(Integer.valueOf(i3));
                                if (l != null && l.longValue() > vaVar2.field_id) {
                                    this.f160445i.put(Integer.valueOf(i3), Long.valueOf(vaVar2.field_id));
                                }
                            } else {
                                this.f160445i.put(Integer.valueOf(i3), Long.valueOf(vaVar2.field_id));
                            }
                            j = vaVar2.field_id;
                            String str3 = this.f160443g;
                            Log.m105924i(str3, "onSceneEnd :" + linkedList.size() + " lastMentionId:" + j + " index:" + i3);
                            FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = this.f160449p;
                            finderMsgUIItemBrowseStruct.f155720e = finderMsgUIItemBrowseStruct.f155720e + ((long) linkedList.size());
                            mo78486q(MAlarmHandler.NEXT_FIRE_INTERVAL, linkedList.size(), i3, true, true);
                        }
                    }
                    j = -1;
                    String str32 = this.f160443g;
                    Log.m105924i(str32, "onSceneEnd :" + linkedList.size() + " lastMentionId:" + j + " index:" + i3);
                    FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct2 = this.f160449p;
                    finderMsgUIItemBrowseStruct2.f155720e = finderMsgUIItemBrowseStruct2.f155720e + ((long) linkedList.size());
                    mo78486q(MAlarmHandler.NEXT_FIRE_INTERVAL, linkedList.size(), i3, true, true);
                } else {
                    NotifyViewCallback notifyViewCallback = this.f160447n.get(i3);
                    C87412m.m108593f(notifyViewCallback, "viewCallbacks[index]");
                    FinderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1 finderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1 = new FinderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1(this, i3, notifyViewCallback);
                    long uptimeMillis = SystemClock.uptimeMillis() - FinderNotifyContract.f160438a.mo78483a(i3);
                    C37521f.f99374d.getClass();
                    C35464c<Long> cVar = C37521f.f99343Z1;
                    if (uptimeMillis >= cVar.mo60266n().longValue()) {
                        finderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1.run();
                        return;
                    }
                    Pattern pattern = C61926c.f176038a;
                    MMHandlerThread.postToMainThreadDelayed(finderNotifyContract$NotifyPresenter$refreshEmpty$runnable$1, cVar.mo60266n().longValue() - uptimeMillis);
                }
            }
        }

        /* renamed from: q */
        public final void mo78486q(long j, int i, int i2, boolean z, boolean z2) {
            C61926c.m72656A((String) null, new FinderNotifyContract$NotifyPresenter$loadDataAndRefresh$1(this, j, i2, i, z, z2));
        }

        /* renamed from: t */
        public final void mo78487t(int i, boolean z) {
            ArrayList<NotifyViewCallback> arrayList = this.f160447n;
            if (!(i >= 0 && i < arrayList.size())) {
                arrayList = null;
            }
            NotifyViewCallback notifyViewCallback = arrayList != null ? arrayList.get(i) : null;
            if (notifyViewCallback != null) {
                C61926c.m72668M(new FinderNotifyContract$NotifyViewCallback$showRefreshTip$1((String) null, notifyViewCallback, false, 0));
            }
            Log.m105924i(this.f160443g, "requestRefresh " + i + ", " + z);
            if (!z) {
                mo78484e(i);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyPresenter;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "UICallbackListener", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback */
    public static final class NotifyViewCallback implements C8178c<NotifyPresenter>, HeadFooterLayout.C57874a {

        /* renamed from: d */
        public final int f160452d;

        /* renamed from: e */
        public final String f160453e = ("Finder.NotifyViewCallback." + hashCode());

        /* renamed from: f */
        public final boolean f160454f = true;

        /* renamed from: g */
        public final NotifyPresenter f160455g;

        /* renamed from: h */
        public final MMActivity f160456h;

        /* renamed from: i */
        public final View f160457i;

        /* renamed from: j */
        public WxRecyclerAdapter<C55011a> f160458j;

        /* renamed from: n */
        public RecyclerView f160459n;

        /* renamed from: o */
        public RefreshLoadMoreLayout f160460o;

        /* renamed from: p */
        public MMProcessBar f160461p;

        /* renamed from: q */
        public TextView f160462q;

        /* renamed from: r */
        public C46547x1 f160463r;

        /* renamed from: s */
        public final UICallbackListener f160464s;

        /* renamed from: t */
        public C78253a f160465t;

        /* renamed from: u */
        public final int f160466u;

        /* renamed from: v */
        public final int f160467v;

        /* renamed from: w */
        public C60798d2 f160468w;

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$UICallbackListener;", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$UICallbackListener */
        public interface UICallbackListener {
            /* renamed from: J */
            void mo78494J(C66276va vaVar);
        }

        public NotifyViewCallback(MMActivity mMActivity, View view, NotifyPresenter notifyPresenter, UICallbackListener uICallbackListener, int i) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(view, "notifyView");
            C87412m.m108594g(notifyPresenter, "presenter");
            this.f160452d = i;
            this.f160455g = notifyPresenter;
            this.f160456h = mMActivity;
            this.f160457i = view;
            this.f160464s = uICallbackListener;
            this.f160466u = 100;
            this.f160467v = 101;
        }

        /* renamed from: D */
        public static final void m64263D(NotifyViewCallback notifyViewCallback, boolean z, FinderObject finderObject, long j) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            int i;
            String str7;
            C64417hb1 hb12;
            C64488kb1 kb12;
            C64417hb1 hb13;
            C64488kb1 kb13;
            C64519lb1 lb12;
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
            C64519lb1 lb13;
            C64417hb1 hb116;
            C64488kb1 kb116;
            C64417hb1 hb117;
            C64488kb1 kb117;
            C64417hb1 hb118;
            C64488kb1 kb118;
            LinkedList<FinderMedia> linkedList;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            int i2;
            String str13;
            String str14;
            String str15;
            String str16;
            C64417hb1 hb119;
            C64488kb1 kb119;
            C64417hb1 hb120;
            C64488kb1 kb120;
            C64417hb1 hb121;
            C64488kb1 kb121;
            C64417hb1 hb122;
            C64488kb1 kb122;
            C64417hb1 hb123;
            C64488kb1 kb123;
            C64417hb1 hb124;
            C64488kb1 kb124;
            C64417hb1 hb125;
            C64488kb1 kb125;
            C64417hb1 hb126;
            C64488kb1 kb126;
            C64417hb1 hb127;
            C64488kb1 kb127;
            C64417hb1 hb128;
            C64488kb1 kb128;
            C64417hb1 hb129;
            C64488kb1 kb129;
            C64417hb1 hb130;
            C64488kb1 kb130;
            C64417hb1 hb131;
            C64488kb1 kb131;
            C64417hb1 hb132;
            C64488kb1 kb132;
            C64519lb1 lb14;
            C64417hb1 hb133;
            C64488kb1 kb133;
            C64417hb1 hb134;
            C64488kb1 kb134;
            C64417hb1 hb135;
            C64488kb1 kb135;
            FinderObjectDesc finderObjectDesc;
            C64417hb1 hb136;
            C64488kb1 kb136;
            LinkedList<FinderMedia> linkedList2;
            FinderMedia finderMedia;
            NotifyViewCallback notifyViewCallback2 = notifyViewCallback;
            boolean z2 = z;
            FinderObject finderObject2 = finderObject;
            long j2 = j;
            Class<C58684b> cls = C58684b.class;
            String str17 = "key_mv_song_name";
            String str18 = "key_mv_report_data";
            Class<C13442s8> cls2 = C13442s8.class;
            String str19 = "randomUUID().toString()";
            String str20 = "jump to musicMvMainUI";
            String str21 = "key_mv_song_mid";
            C13598b0 b0Var = null;
            String str22 = "key_mv_music_operation_url";
            String str23 = "key_mv_album_cover_url";
            String str24 = "key_mv_issue_date";
            String str25 = "key_mv_music_genre";
            String str26 = "key_mv_album_name";
            String str27 = "key_mv_singer_name";
            String str28 = "key_mv_song_lyric";
            if (notifyViewCallback2.f160455g.f160440d == 2) {
                FinderObjectDesc finderObjectDesc2 = finderObject2.objectDesc;
                if (finderObjectDesc2 == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) {
                    str8 = "key_mv_music_duration";
                    str9 = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    str8 = "key_mv_music_duration";
                    sb.append(finderMedia.thumbUrl);
                    sb.append(finderMedia.thumb_url_token);
                    str9 = sb.toString();
                }
                if (!(!(str9 == null || str9.length() == 0) || (finderObjectDesc = finderObject2.objectDesc) == null || (hb136 = finderObjectDesc.mvInfo) == null || (kb136 = hb136.f183456e) == null || (str9 = kb136.f183912o) != null)) {
                    str9 = "";
                }
                FinderContact finderContact = finderObject2.contact;
                String str29 = finderContact != null ? finderContact.nickname : null;
                C64719t23 t232 = new C64719t23();
                String str30 = "key_mv_identification";
                String str31 = "key_mv_extra_info";
                long j3 = finderObject2.f164794id;
                C64719t23 t233 = t232;
                String str32 = finderObject2.objectNonceId;
                if (!(str9 == null || str29 == null || str32 == null)) {
                    Intent intent = new Intent();
                    intent.putExtra("key_mv_cover_url", str9);
                    intent.putExtra("key_mv_feed_id", C61926c.m72691p(j3));
                    intent.putExtra("key_mv_nonce_id", str32);
                    intent.putExtra("key_mv_poster", str29);
                    intent.putExtra("key_launch_mv_comment", z2);
                    intent.putExtra("key_refer_mv_comment_id", j2);
                    C58784w3.f168295a.mo83873H1(intent, notifyViewCallback2.f160455g.f160440d, notifyViewCallback2.f160452d);
                    intent.putExtra("key_need_update_music_ball_url", true);
                    Intent intent2 = intent;
                    finderObject2 = finderObject;
                    FinderObjectDesc finderObjectDesc3 = finderObject2.objectDesc;
                    if (finderObjectDesc3 == null || (hb135 = finderObjectDesc3.mvInfo) == null || (kb135 = hb135.f183456e) == null || (str10 = kb135.f183916s) == null) {
                        str10 = "";
                    }
                    String str33 = str31;
                    intent2.putExtra(str33, str10);
                    FinderObjectDesc finderObjectDesc4 = finderObject2.objectDesc;
                    if (finderObjectDesc4 == null || (hb134 = finderObjectDesc4.mvInfo) == null || (kb134 = hb134.f183456e) == null || (str11 = kb134.f183917t) == null) {
                        str11 = "";
                    }
                    String str34 = str30;
                    intent2.putExtra(str34, str11);
                    FinderObjectDesc finderObjectDesc5 = finderObject2.objectDesc;
                    if (finderObjectDesc5 == null || (hb133 = finderObjectDesc5.mvInfo) == null || (kb133 = hb133.f183456e) == null) {
                        str12 = str8;
                        i2 = 0;
                    } else {
                        i2 = kb133.f183918u;
                        str12 = str8;
                    }
                    intent2.putExtra(str12, i2);
                    FinderObjectDesc finderObjectDesc6 = finderObject2.objectDesc;
                    if (finderObjectDesc6 == null || (hb132 = finderObjectDesc6.mvInfo) == null || (kb132 = hb132.f183456e) == null || (lb14 = kb132.f183921x) == null || (str13 = lb14.f184069d) == null) {
                        str13 = "";
                    }
                    String str35 = str22;
                    intent2.putExtra(str35, str13);
                    FinderObjectDesc finderObjectDesc7 = finderObject2.objectDesc;
                    if (finderObjectDesc7 == null || (hb131 = finderObjectDesc7.mvInfo) == null || (kb131 = hb131.f183456e) == null || (str15 = kb131.f183922y) == null) {
                        str14 = str21;
                        str15 = "";
                    } else {
                        str14 = str21;
                    }
                    intent2.putExtra(str14, str15);
                    String p = C61926c.m72691p(j3);
                    C64719t23 t234 = t233;
                    t234.f185459d = p;
                    t234.f185460e = str32;
                    t234.f185461f = str9;
                    t234.f185462g = str29;
                    FinderObjectDesc finderObjectDesc8 = finderObject2.objectDesc;
                    t234.f185463h = (finderObjectDesc8 == null || (hb130 = finderObjectDesc8.mvInfo) == null || (kb130 = hb130.f183456e) == null) ? null : kb130.f183905e;
                    t234.f185464i = (finderObjectDesc8 == null || (hb129 = finderObjectDesc8.mvInfo) == null || (kb129 = hb129.f183456e) == null) ? null : kb129.f183911n;
                    t234.f185465j = (finderObjectDesc8 == null || (hb128 = finderObjectDesc8.mvInfo) == null || (kb128 = hb128.f183456e) == null) ? null : kb128.f183916s;
                    t234.f185466n = (finderObjectDesc8 == null || (hb127 = finderObjectDesc8.mvInfo) == null || (kb127 = hb127.f183456e) == null) ? null : kb127.f183913p;
                    t234.f185467o = (finderObjectDesc8 == null || (hb126 = finderObjectDesc8.mvInfo) == null || (kb126 = hb126.f183456e) == null) ? 0 : kb126.f183915r;
                    t234.f185468p = (finderObjectDesc8 == null || (hb125 = finderObjectDesc8.mvInfo) == null || (kb125 = hb125.f183456e) == null) ? null : kb125.f183905e;
                    t234.f185469q = (finderObjectDesc8 == null || (hb124 = finderObjectDesc8.mvInfo) == null || (kb124 = hb124.f183456e) == null) ? 0 : kb124.f183918u;
                    t234.f185473u = (finderObjectDesc8 == null || (hb123 = finderObjectDesc8.mvInfo) == null || (kb123 = hb123.f183456e) == null) ? null : kb123.f183904d;
                    t234.f185474v = (finderObjectDesc8 == null || (hb122 = finderObjectDesc8.mvInfo) == null || (kb122 = hb122.f183456e) == null) ? null : kb122.f183910j;
                    t234.f185475w = (finderObjectDesc8 == null || (hb121 = finderObjectDesc8.mvInfo) == null || (kb121 = hb121.f183456e) == null) ? null : kb121.f183912o;
                    if (finderObjectDesc8 == null || (hb120 = finderObjectDesc8.mvInfo) == null || (kb120 = hb120.f183456e) == null || (str16 = kb120.f183922y) == null) {
                        str16 = "";
                    }
                    t234.f185470r = str16;
                    t234.f185472t = str9;
                    Log.m105924i(notifyViewCallback2.f160453e, str20);
                    FinderObjectDesc finderObjectDesc9 = finderObject2.objectDesc;
                    if (!(finderObjectDesc9 == null || (hb119 = finderObjectDesc9.mvInfo) == null || (kb119 = hb119.f183456e) == null)) {
                        C65415e0.f188260a.mo89507e(kb119, C61926c.m72691p(finderObject2.f164794id), 13, t234);
                    }
                    C64793w23 w232 = new C64793w23();
                    String uuid = UUID.randomUUID().toString();
                    C87412m.m108593f(uuid, str19);
                    w232.f186034e = uuid;
                    w232.f186035f = 86;
                    w232.f186036g = C61926c.m72691p(finderObject2.f164794id);
                    w232.f186033d = 5;
                    w232.f186038i = ((C13442s8) C39818r.f106831a.mo62444c(notifyViewCallback2.f160456h).mo75002a(cls2)).f38098n;
                    intent2.putExtra(str18, w232.toByteArray());
                    String str36 = t234.f185473u;
                    String str37 = str17;
                    if (str36 == null) {
                        str36 = "";
                    }
                    intent2.putExtra(str37, str36);
                    String str38 = t234.f185474v;
                    if (str38 == null) {
                        str38 = "";
                    }
                    intent2.putExtra(str28, str38);
                    String str39 = t234.f185463h;
                    if (str39 == null) {
                        str39 = "";
                    }
                    intent2.putExtra(str27, str39);
                    String str40 = t234.f185464i;
                    if (str40 == null) {
                        str40 = "";
                    }
                    intent2.putExtra(str26, str40);
                    String str41 = t234.f185466n;
                    if (str41 == null) {
                        str41 = "";
                    }
                    intent2.putExtra(str25, str41);
                    intent2.putExtra(str24, String.valueOf(t234.f185467o));
                    String str42 = t234.f185475w;
                    if (str42 == null) {
                        str42 = "";
                    }
                    intent2.putExtra(str23, str42);
                    String str43 = t234.f185468p;
                    if (str43 == null) {
                        str43 = "";
                    }
                    intent2.putExtra(str34, str43);
                    String str44 = t234.f185465j;
                    if (str44 == null) {
                        str44 = "";
                    }
                    intent2.putExtra(str33, str44);
                    intent2.putExtra(str12, t234.f185469q);
                    intent2.putExtra(str35, t234.f185471s);
                    intent2.putExtra(str14, t234.f185470r);
                    ((C58684b) C86312j.m106911c(cls)).jy0(notifyViewCallback2.f160456h, intent2);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    Log.m105924i(notifyViewCallback2.f160453e, "jump to musicMvMainUI error " + str9 + ' ' + str29 + ' ' + finderObject2.f164794id + ' ' + finderObject2.objectNonceId);
                    return;
                }
                return;
            }
            String str45 = "key_mv_identification";
            String str46 = str21;
            String str47 = str23;
            String str48 = str24;
            String str49 = str25;
            String str50 = str26;
            String str51 = str27;
            String str52 = str28;
            String str53 = "key_mv_music_duration";
            String str54 = str22;
            FinderObjectDesc finderObjectDesc10 = finderObject2.objectDesc;
            FinderMedia finderMedia2 = (finderObjectDesc10 == null || (linkedList = finderObjectDesc10.media) == null) ? null : (FinderMedia) C110818d0.m150916N(linkedList);
            if (finderMedia2 != null) {
                str2 = str54;
                StringBuilder sb4 = new StringBuilder();
                str = str53;
                sb4.append(finderMedia2.thumbUrl);
                sb4.append(finderMedia2.thumb_url_token);
                str3 = sb4.toString();
            } else {
                str2 = str54;
                str = str53;
                str3 = "";
            }
            Intent intent3 = new Intent();
            String str55 = str45;
            intent3.putExtra("key_mv_finder_obj", finderObject.toByteArray());
            intent3.putExtra("key_launch_mv_comment", z2);
            String str56 = "key_mv_extra_info";
            intent3.putExtra("key_mv_feed_id", C61926c.m72691p(finderObject2.f164794id));
            intent3.putExtra("key_mv_nonce_id", finderObject2.objectNonceId);
            intent3.putExtra("key_refer_mv_comment_id", j2);
            intent3.putExtra("key_mv_cover_url", str3);
            FinderContact finderContact2 = finderObject2.contact;
            intent3.putExtra("key_mv_poster", finderContact2 != null ? finderContact2.nickname : null);
            C58784w3.f168295a.mo83873H1(intent3, notifyViewCallback2.f160455g.f160440d, notifyViewCallback2.f160452d);
            FinderObjectDesc finderObjectDesc11 = finderObject2.objectDesc;
            if (finderObjectDesc11 == null || (hb118 = finderObjectDesc11.mvInfo) == null || (kb118 = hb118.f183456e) == null || (str4 = kb118.f183916s) == null) {
                str4 = "";
            }
            String str57 = str56;
            intent3.putExtra(str57, str4);
            FinderObjectDesc finderObjectDesc12 = finderObject2.objectDesc;
            if (finderObjectDesc12 == null || (hb117 = finderObjectDesc12.mvInfo) == null || (kb117 = hb117.f183456e) == null || (str5 = kb117.f183917t) == null) {
                str5 = "";
            }
            String str58 = str55;
            intent3.putExtra(str58, str5);
            FinderObjectDesc finderObjectDesc13 = finderObject2.objectDesc;
            if (finderObjectDesc13 == null || (hb116 = finderObjectDesc13.mvInfo) == null || (kb116 = hb116.f183456e) == null) {
                str6 = str;
                i = 0;
            } else {
                i = kb116.f183918u;
                str6 = str;
            }
            intent3.putExtra(str6, i);
            FinderObjectDesc finderObjectDesc14 = finderObject2.objectDesc;
            if (finderObjectDesc14 == null || (hb115 = finderObjectDesc14.mvInfo) == null || (kb115 = hb115.f183456e) == null || (lb13 = kb115.f183921x) == null || (str7 = lb13.f184069d) == null) {
                str7 = "";
            }
            String str59 = str2;
            intent3.putExtra(str59, str7);
            C64719t23 t235 = new C64719t23();
            t235.f185459d = C61926c.m72691p(finderObject2.f164794id);
            t235.f185460e = finderObject2.objectNonceId;
            t235.f185461f = str3;
            FinderContact finderContact3 = finderObject2.contact;
            t235.f185462g = finderContact3 != null ? finderContact3.nickname : null;
            FinderObjectDesc finderObjectDesc15 = finderObject2.objectDesc;
            t235.f185463h = (finderObjectDesc15 == null || (hb114 = finderObjectDesc15.mvInfo) == null || (kb114 = hb114.f183456e) == null) ? null : kb114.f183905e;
            t235.f185464i = (finderObjectDesc15 == null || (hb113 = finderObjectDesc15.mvInfo) == null || (kb113 = hb113.f183456e) == null) ? null : kb113.f183911n;
            t235.f185465j = (finderObjectDesc15 == null || (hb112 = finderObjectDesc15.mvInfo) == null || (kb112 = hb112.f183456e) == null) ? null : kb112.f183916s;
            t235.f185466n = (finderObjectDesc15 == null || (hb111 = finderObjectDesc15.mvInfo) == null || (kb111 = hb111.f183456e) == null) ? null : kb111.f183913p;
            t235.f185467o = (finderObjectDesc15 == null || (hb110 = finderObjectDesc15.mvInfo) == null || (kb110 = hb110.f183456e) == null) ? 0 : kb110.f183915r;
            t235.f185468p = (finderObjectDesc15 == null || (hb19 = finderObjectDesc15.mvInfo) == null || (kb19 = hb19.f183456e) == null) ? null : kb19.f183917t;
            t235.f185469q = (finderObjectDesc15 == null || (hb18 = finderObjectDesc15.mvInfo) == null || (kb18 = hb18.f183456e) == null) ? 0 : kb18.f183918u;
            t235.f185473u = (finderObjectDesc15 == null || (hb17 = finderObjectDesc15.mvInfo) == null || (kb17 = hb17.f183456e) == null) ? null : kb17.f183904d;
            t235.f185474v = (finderObjectDesc15 == null || (hb16 = finderObjectDesc15.mvInfo) == null || (kb16 = hb16.f183456e) == null) ? null : kb16.f183910j;
            t235.f185475w = (finderObjectDesc15 == null || (hb15 = finderObjectDesc15.mvInfo) == null || (kb15 = hb15.f183456e) == null) ? null : kb15.f183912o;
            t235.f185470r = (finderObjectDesc15 == null || (hb14 = finderObjectDesc15.mvInfo) == null || (kb14 = hb14.f183456e) == null) ? null : kb14.f183922y;
            t235.f185472t = str3;
            t235.f185471s = (finderObjectDesc15 == null || (hb13 = finderObjectDesc15.mvInfo) == null || (kb13 = hb13.f183456e) == null || (lb12 = kb13.f183921x) == null) ? null : lb12.f184069d;
            if (!(finderObjectDesc15 == null || (hb12 = finderObjectDesc15.mvInfo) == null || (kb12 = hb12.f183456e) == null)) {
                C65415e0.f188260a.mo89507e(kb12, C61926c.m72691p(finderObject2.f164794id), 13, t235);
            }
            Log.m105924i(notifyViewCallback2.f160453e, str20);
            C64793w23 w233 = new C64793w23();
            String uuid2 = UUID.randomUUID().toString();
            C87412m.m108593f(uuid2, str19);
            w233.f186034e = uuid2;
            w233.f186035f = 86;
            w233.f186036g = C61926c.m72691p(finderObject2.f164794id);
            w233.f186033d = 15;
            w233.f186038i = ((C13442s8) C39818r.f106831a.mo62444c(notifyViewCallback2.f160456h).mo75002a(cls2)).f38098n;
            intent3.putExtra(str18, w233.toByteArray());
            String str60 = t235.f185473u;
            String str61 = str17;
            if (str60 == null) {
                str60 = "";
            }
            intent3.putExtra(str61, str60);
            String str62 = t235.f185474v;
            if (str62 == null) {
                str62 = "";
            }
            intent3.putExtra(str52, str62);
            String str63 = t235.f185463h;
            if (str63 == null) {
                str63 = "";
            }
            intent3.putExtra(str51, str63);
            String str64 = t235.f185464i;
            if (str64 == null) {
                str64 = "";
            }
            intent3.putExtra(str50, str64);
            String str65 = t235.f185466n;
            if (str65 == null) {
                str65 = "";
            }
            intent3.putExtra(str49, str65);
            intent3.putExtra(str48, String.valueOf(t235.f185467o));
            String str66 = t235.f185475w;
            if (str66 == null) {
                str66 = "";
            }
            intent3.putExtra(str47, str66);
            String str67 = t235.f185468p;
            if (str67 == null) {
                str67 = "";
            }
            intent3.putExtra(str58, str67);
            String str68 = t235.f185465j;
            if (str68 == null) {
                str68 = "";
            }
            intent3.putExtra(str57, str68);
            intent3.putExtra(str6, t235.f185469q);
            intent3.putExtra(str59, t235.f185471s);
            intent3.putExtra(str46, t235.f185470r);
            ((C58684b) C86312j.m106911c(cls)).jy0(notifyViewCallback2.f160456h, intent3);
        }

        /* renamed from: y */
        public static final void m64264y(NotifyViewCallback notifyViewCallback, int i) {
            switch (i) {
                case -8003:
                    C76879j.m92738i(notifyViewCallback.f160456h, C0966R.string.eoh, 0);
                    return;
                case -8002:
                    C76879j.m92738i(notifyViewCallback.f160456h, C0966R.string.d_8, 0);
                    return;
                case -8001:
                    C76879j.m92738i(notifyViewCallback.f160456h, C0966R.string.f360503d90, 0);
                    return;
                default:
                    notifyViewCallback.getClass();
                    return;
            }
        }

        /* renamed from: E0 */
        public final void mo78488E0() {
            String str = this.f160453e;
            Log.m105924i(str, "initRefresh:" + this.f160452d);
            Pattern pattern = C61926c.f176038a;
            C61926c.m72701z(C88643g.m110546d(), new FinderNotifyContract$NotifyViewCallback$initAndRefreshAll$1(this));
            C61926c.m72666K(200, new FinderNotifyContract$NotifyViewCallback$initAndRefreshAll$2(this));
        }

        /* renamed from: F0 */
        public final void mo78489F0() {
            String str = this.f160453e;
            Log.m105924i(str, "refresh: " + this.f160452d);
            C61926c.m72666K(250, new FinderNotifyContract$NotifyViewCallback$refresh$1(this));
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo78490Z() {
            /*
                r15 = this;
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r15.f160455g
                int r1 = r1.f160440d
                r2 = 2131829142(0x7f112196, float:1.9291245E38)
                r3 = 1
                r5 = 0
                r6 = 2
                java.lang.String r8 = "getResources().getString…                        )"
                java.lang.String r9 = ""
                r10 = 1
                if (r1 != r10) goto L_0x0098
                int r1 = r15.f160452d
                r11 = 2
                if (r1 == 0) goto L_0x0026
                if (r1 == r10) goto L_0x0023
                if (r1 == r11) goto L_0x0020
                r1 = r9
                goto L_0x0028
            L_0x0020:
                java.lang.String r1 = "NotificationCenterFollow"
                goto L_0x0028
            L_0x0023:
                java.lang.String r1 = "NotificationCenterComment"
                goto L_0x0028
            L_0x0026:
                java.lang.String r1 = "NotificationCenterLike"
            L_0x0028:
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
                te3.nn1 r0 = r0.mo77246R5(r1)
                if (r0 == 0) goto L_0x0141
                int r1 = r15.f160452d
                if (r1 == 0) goto L_0x0073
                if (r1 == r10) goto L_0x005c
                if (r1 == r11) goto L_0x0041
                goto L_0x008b
            L_0x0041:
                r3 = 4
                android.content.res.Resources r1 = fo1.C8178c.C8179a.m8259a(r15)
                r2 = 2131829143(0x7f112197, float:1.9291247E38)
                java.lang.Object[] r6 = new java.lang.Object[r10]
                int r0 = r0.f184503e
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r6[r5] = r0
                java.lang.String r9 = r1.getString(r2, r6)
                gy3.C87412m.m108593f(r9, r8)
                goto L_0x008b
            L_0x005c:
                android.content.res.Resources r1 = fo1.C8178c.C8179a.m8259a(r15)
                java.lang.Object[] r3 = new java.lang.Object[r10]
                int r0 = r0.f184503e
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r3[r5] = r0
                java.lang.String r9 = r1.getString(r2, r3)
                gy3.C87412m.m108593f(r9, r8)
                r3 = r6
                goto L_0x008b
            L_0x0073:
                android.content.res.Resources r1 = fo1.C8178c.C8179a.m8259a(r15)
                r2 = 2131829144(0x7f112198, float:1.9291249E38)
                java.lang.Object[] r6 = new java.lang.Object[r10]
                int r0 = r0.f184503e
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r6[r5] = r0
                java.lang.String r9 = r1.getString(r2, r6)
                gy3.C87412m.m108593f(r9, r8)
            L_0x008b:
                er1.j4 r0 = er1.C58739j4.f168176a
                boolean r0 = r0.mo83684M(r3)
                if (r0 != 0) goto L_0x0141
                r15.mo78493m0(r9)
                goto L_0x0141
            L_0x0098:
                int r1 = r15.f160452d
                java.lang.String r11 = "WxMessageComment"
                java.lang.String r12 = "WxMessageLike"
                if (r1 == 0) goto L_0x00a6
                if (r1 == r10) goto L_0x00a4
                r1 = r9
                goto L_0x00a7
            L_0x00a4:
                r1 = r11
                goto L_0x00a7
            L_0x00a6:
                r1 = r12
            L_0x00a7:
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
                te3.nn1 r0 = r0.mo77246R5(r1)
                if (r0 == 0) goto L_0x0141
                java.lang.String r1 = r15.f160453e
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "addWxMessageHeader count:"
                r13.append(r14)
                int r14 = r0.f184503e
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
                int r1 = r15.f160452d
                if (r1 == 0) goto L_0x00ed
                if (r1 == r10) goto L_0x00d6
                goto L_0x0105
            L_0x00d6:
                android.content.res.Resources r1 = fo1.C8178c.C8179a.m8259a(r15)
                java.lang.Object[] r9 = new java.lang.Object[r10]
                int r0 = r0.f184503e
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r9[r5] = r0
                java.lang.String r0 = r1.getString(r2, r9)
                gy3.C87412m.m108593f(r0, r8)
                r1 = r6
                goto L_0x0107
            L_0x00ed:
                android.content.res.Resources r1 = fo1.C8178c.C8179a.m8259a(r15)
                r2 = 2131840299(0x7f114d2b, float:1.9313874E38)
                java.lang.Object[] r9 = new java.lang.Object[r10]
                int r0 = r0.f184503e
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r9[r5] = r0
                java.lang.String r9 = r1.getString(r2, r9)
                gy3.C87412m.m108593f(r9, r8)
            L_0x0105:
                r1 = r3
                r0 = r9
            L_0x0107:
                er1.j4 r8 = er1.C58739j4.f168176a
                int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r9 != 0) goto L_0x0112
                boolean r5 = r8.mo83693V(r12)
                goto L_0x011e
            L_0x0112:
                int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r3 != 0) goto L_0x011b
                boolean r5 = r8.mo83693V(r11)
                goto L_0x011e
            L_0x011b:
                r8.getClass()
            L_0x011e:
                java.lang.String r3 = er1.C58739j4.f168177b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "isWxMessageSwitchEnable type:"
                r4.append(r6)
                r4.append(r1)
                java.lang.String r1 = " enable:"
                r4.append(r1)
                r4.append(r5)
                java.lang.String r1 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                if (r5 == 0) goto L_0x0141
                r15.mo78493m0(r0)
            L_0x0141:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.mo78490Z():void");
        }

        /* renamed from: a */
        public final void mo78491a() {
            C58556f j3;
            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) this.f160457i.findViewById(C0966R.C0970id.ivb);
            this.f160460o = refreshLoadMoreLayout;
            if (!this.f160454f) {
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setEnableRefresh(false);
                    mo78490Z();
                }
            } else if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableRefresh(false);
                mo78490Z();
                refreshLoadMoreLayout.setLimitTopRequest(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
                refreshLoadMoreLayout.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)));
                refreshLoadMoreLayout.setDamping(1.85f);
                this.f160461p = (MMProcessBar) this.f160457i.findViewById(C0966R.C0970id.ive);
                refreshLoadMoreLayout.setActionCallback(new FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1(refreshLoadMoreLayout, this));
                refreshLoadMoreLayout.setOverCallback(this);
            }
            this.f160465t = new C78253a(this.f160456h);
            View findViewById = this.f160457i.findViewById(C0966R.C0970id.hk8);
            C87412m.m108593f(findViewById, "contentView.findViewById….id.notify_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f160459n = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f160456h));
            TextView textView = (TextView) this.f160457i.findViewById(C0966R.C0970id.hk9);
            this.f160462q = textView;
            if (textView != null) {
                textView.setOnClickListener(new FinderNotifyContract$NotifyViewCallback$initView$1(this));
            }
            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderNotifyContract$NotifyViewCallback$initView$2(this), this.f160455g.mo78485n(this.f160452d), true);
            this.f160458j = wxRecyclerAdapter;
            wxRecyclerAdapter.f165737C = new FinderNotifyContract$NotifyViewCallback$initView$3(this);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f160456h);
            if (!(f == null || (j3 = f.mo12854j3(-1)) == null)) {
                RecyclerView recyclerView2 = this.f160459n;
                if (recyclerView2 != null) {
                    j3.mo83455c(recyclerView2);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            RecyclerView recyclerView3 = this.f160459n;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.f160458j);
                WxRecyclerAdapter<C55011a> wxRecyclerAdapter2 = this.f160458j;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.f173488o = new FinderNotifyContract$NotifyViewCallback$initView$4(this);
                }
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.f173487n = new FinderNotifyContract$NotifyViewCallback$initView$5(this);
                }
                RecyclerView recyclerView4 = this.f160459n;
                if (recyclerView4 != null) {
                    C23564m.m28137g(recyclerView4, new FinderNotifyContract$NotifyViewCallback$reportExpose$1(this));
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public MMFragmentActivity getActivity() {
            return this.f160456h;
        }

        /* renamed from: k0 */
        public final void mo78492k0(C66276va vaVar) {
            String str;
            C89349b bVar;
            C66276va vaVar2 = vaVar;
            C58784w3 w3Var = C58784w3.f168295a;
            int i = this.f160455g.f160440d;
            w3Var.getClass();
            boolean z = false;
            int i2 = i == 1 ? 7 : 5;
            C64392gc1 gc12 = vaVar2.field_extInfo;
            if (gc12 == null || (str = gc12.f183301d) == null) {
                str = "";
            }
            if (C87412m.m108589b(str, "music")) {
                C64392gc1 gc13 = vaVar2.field_extInfo;
                if (gc13 == null || (bVar = gc13.f183303f) == null) {
                    Log.m105920e(this.f160453e, "jumpToMusic extBuff empty!");
                } else {
                    C64996a aVar = C64996a.f187120a;
                    byte[] bArr = bVar.f257327a;
                    C87412m.m108593f(bArr, "it.bytes");
                    long j = vaVar2.field_commentId;
                    String str2 = vaVar2.field_extInfo.f183302e;
                    aVar.mo89155a(bArr, j, str2 == null ? "" : str2, this.f160456h);
                    z = true;
                }
            }
            if (!z) {
                long j2 = vaVar2.field_objectId;
                String str3 = vaVar2.field_objectNonceId;
                int i3 = this.f160455g.f160440d;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f160456h);
                C46547x1 x1Var = new C46547x1(j2, str3, i2, i3, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 122816, (C8480h) null);
                this.f160463r = x1Var;
                x1Var.mo9225i().mo123062e(new FinderNotifyContract$NotifyViewCallback$getCommentDetail$1(this, vaVar2, i2));
            }
        }

        /* renamed from: m0 */
        public final void mo78493m0(String str) {
            View inflate = C85868k2.m106137b(this.f160456h).inflate(C0966R.C0971layout.c98, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.izo)).setText(str);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160460o;
            if (refreshLoadMoreLayout != null) {
                int i = HeadFooterLayout.f165569t;
                refreshLoadMoreLayout.mo82391b(inflate, true);
            }
        }

        /* renamed from: p */
        public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
            String str = this.f160453e;
            Log.m105924i(str, "[onOverEnd] dy=" + i2);
            return false;
        }

        /* renamed from: v */
        public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
            String str = this.f160453e;
            Log.m105924i(str, "[onOverStart] dy=" + i2);
            MMProcessBar mMProcessBar = this.f160461p;
            if (mMProcessBar == null) {
                return false;
            }
            mMProcessBar.mo82301a(((float) i2) / ((float) ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3733cm))));
            return false;
        }

        /* renamed from: x */
        public void mo3720x(int i) {
            Log.m105924i(this.f160453e, "[onOverStop]");
            MMProcessBar mMProcessBar = this.f160461p;
            if (mMProcessBar != null) {
                mMProcessBar.mo82303c();
            }
        }
    }

    private FinderNotifyContract() {
    }

    /* renamed from: a */
    public final long mo78483a(int i) {
        ArrayList<Long> arrayList = f160439b;
        Long l = null;
        if ((i >= 0 && i < arrayList.size() ? arrayList : null) != null) {
            l = arrayList.get(i);
        }
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }
}
