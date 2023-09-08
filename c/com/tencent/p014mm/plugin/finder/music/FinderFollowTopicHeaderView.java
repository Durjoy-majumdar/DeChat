package com.tencent.p014mm.plugin.finder.music;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao1.C0143d;
import ao1.C0145d1;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoViewForTopic;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dm1.C7360a;
import dm1.C7361b;
import dm1.C7371o;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58417y0;
import er1.C58684b;
import er1.C58741j5;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58960c;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59679v2;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jh2.C9434j;
import ke3.C88144b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ot1.C11767a;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p232rw.C63679m;
import p707tz.C65000f;
import p910lj.C76701a;
import pe3.C47465a;
import pl1.C62367r0;
import pl1.C62369u0;
import qo3.C77407n;
import qo3.C89779i0;
import rd3.C48020a;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C50119ke1;
import te3.C50985qn1;
import te3.C64284cg;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010i\u001a\u00020h\u0012\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bl\u0010mB#\b\u0016\u0012\u0006\u0010i\u001a\u00020h\u0012\b\u0010k\u001a\u0004\u0018\u00010j\u0012\u0006\u0010n\u001a\u00020@¢\u0006\u0004\bl\u0010oR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010W\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020H8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010J\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR\"\u0010_\u001a\u00020@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR$\u0010g\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006p"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgr1/v2;", "Lob0/n;", "Ldm1/o;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;", "v", "Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;", "getVideoView", "()Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;", "setVideoView", "(Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;)V", "videoView", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "w", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "getOriginFeed", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "setOriginFeed", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "originFeed", "Lte3/qn1;", "x", "Lte3/qn1;", "getFinderBgmInfo", "()Lte3/qn1;", "setFinderBgmInfo", "(Lte3/qn1;)V", "finderBgmInfo", "Lpl1/r0;", "y", "Lpl1/r0;", "getMedia", "()Lpl1/r0;", "setMedia", "(Lpl1/r0;)V", "media", "", "z", "Z", "isFirstClickPlay", "()Z", "setFirstClickPlay", "(Z)V", "Lqo3/i0;", "A", "Lqo3/i0;", "getDialog", "()Lqo3/i0;", "setDialog", "(Lqo3/i0;)V", "dialog", "B", "getDownloadFinish", "setDownloadFinish", "downloadFinish", "Ljh2/j;", "C", "Ljh2/j;", "getAudioInfo", "()Ljh2/j;", "setAudioInfo", "(Ljh2/j;)V", "audioInfo", "", "D", "I", "getType", "()I", "setType", "(I)V", "type", "", "E", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "filePath", "Lcom/tencent/mm/plugin/finder/music/FinderImgFeedMusicTag;", "F", "Lcom/tencent/mm/plugin/finder/music/FinderImgFeedMusicTag;", "getBgmPlayBtn", "()Lcom/tencent/mm/plugin/finder/music/FinderImgFeedMusicTag;", "setBgmPlayBtn", "(Lcom/tencent/mm/plugin/finder/music/FinderImgFeedMusicTag;)V", "bgmPlayBtn", "G", "getAudioPath", "setAudioPath", "audioPath", "H", "getTabType", "setTabType", "tabType", "Landroid/view/View$OnClickListener;", "K", "Landroid/view/View$OnClickListener;", "getCurrentListener", "()Landroid/view/View$OnClickListener;", "setCurrentListener", "(Landroid/view/View$OnClickListener;)V", "currentListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView */
public final class FinderFollowTopicHeaderView extends ConstraintLayout implements C59679v2, C11385n, C7371o {

    /* renamed from: R */
    public static final /* synthetic */ int f160154R = 0;

    /* renamed from: A */
    public C89779i0 f160155A;

    /* renamed from: B */
    public volatile boolean f160156B;

    /* renamed from: C */
    public C9434j f160157C;

    /* renamed from: D */
    public int f160158D;

    /* renamed from: E */
    public String f160159E = "";

    /* renamed from: F */
    public FinderImgFeedMusicTag f160160F;

    /* renamed from: G */
    public String f160161G = "";

    /* renamed from: H */
    public int f160162H;

    /* renamed from: I */
    public C50119ke1 f160163I;

    /* renamed from: J */
    public C0145d1 f160164J;

    /* renamed from: K */
    public View.OnClickListener f160165K;

    /* renamed from: L */
    public View.OnClickListener f160166L = new C56166q(this);

    /* renamed from: M */
    public View.OnClickListener f160167M = new C56164o(this);

    /* renamed from: N */
    public View.OnClickListener f160168N = new C56165p(this);

    /* renamed from: P */
    public View.OnClickListener f160169P = new C56163n(this);

    /* renamed from: Q */
    public View.OnClickListener f160170Q = new C56156f(this);

    /* renamed from: v */
    public FinderVideoViewForTopic f160171v;

    /* renamed from: w */
    public FinderItem f160172w;

    /* renamed from: x */
    public C50985qn1 f160173x;

    /* renamed from: y */
    public C62367r0 f160174y;

    /* renamed from: z */
    public boolean f160175z = true;

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$b */
    public static final class C3264b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C50985qn1 f15495d;

        /* renamed from: e */
        public final /* synthetic */ FinderFollowTopicHeaderView f15496e;

        public C3264b(C50985qn1 qn12, FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f15495d = qn12;
            this.f15496e = finderFollowTopicHeaderView;
        }

        public final void onClick(View view) {
            C13598b0 b0Var;
            C64284cg a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderContact finderContact = this.f15495d.f140407d;
            String str = null;
            if (finderContact == null || (a = C58960c.m68829a(finderContact, false)) == null) {
                b0Var = null;
            } else {
                FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f15496e;
                Intent intent = new Intent();
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = finderFollowTopicHeaderView.getContext();
                C87412m.m108593f(context, "context");
                aVar.mo12871c(context, intent);
                intent.putExtra("Contact_User", a.f182468d);
                intent.putExtra("Contact_Scene", 213);
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("biz_profile_tab_type", 1);
                C88144b.m109791i(finderFollowTopicHeaderView.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                FinderFollowTopicHeaderView finderFollowTopicHeaderView2 = this.f15496e;
                C50985qn1 qn12 = this.f15495d;
                Intent intent2 = new Intent();
                FinderContact finderContact2 = qn12.f140407d;
                if (finderContact2 != null) {
                    str = finderContact2.username;
                }
                intent2.putExtra("finder_username", str);
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context2 = finderFollowTopicHeaderView2.getContext();
                C87412m.m108593f(context2, "context");
                C13442s8.C13443a.m12791e(aVar2, context2, intent2, 0, (String) null, 0, 6, false, 0, 192, (Object) null);
                Context context3 = view.getContext();
                C87412m.m108593f(context3, "it.context");
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context3, intent2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$c */
    public static final class C3265c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f15497d;

        public C3265c(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f15497d = finderFollowTopicHeaderView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76912y0.makeText(this.f15497d.getContext(), (int) C0966R.string.d_w, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$onResume$1", mo125469f = "FinderFollowTopicHeaderView.kt", mo125470l = {196}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$m */
    public static final class C3266m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f15498d;

        public C3266m(C15601d<? super C3266m> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3266m(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C3266m((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f15498d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                this.f15498d = 1;
                if (bVar.mo90679u0(11, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m168123unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$a */
    public static final class C56153a extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56153a(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            super(2);
            this.f160176d = finderFollowTopicHeaderView;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            Log.m105924i("FinderFollowTopicHeaderView", "success:" + booleanValue + " , filePath:" + str + ", fileExist:" + C48020a.m53385b(this.f160176d.getFilePath()));
            C61926c.m72668M(new C56168a(this.f160176d, str, booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$d */
    public static final class C56154d extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56154d(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            super(2);
            this.f160177d = finderFollowTopicHeaderView;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            Log.m105924i("FinderFollowTopicHeaderView", "success:" + booleanValue + " , filePath:" + str + ", fileExist:" + C48020a.m53385b(this.f160177d.getFilePath()));
            C61926c.m72668M(new C56169b(this.f160177d, str, booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$e */
    public static final class C56155e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160178d;

        /* renamed from: e */
        public final /* synthetic */ int f160179e;

        public C56155e(FinderFollowTopicHeaderView finderFollowTopicHeaderView, int i) {
            this.f160178d = finderFollowTopicHeaderView;
            this.f160179e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f160178d;
            int i = this.f160179e;
            int i2 = FinderFollowTopicHeaderView.f160154R;
            finderFollowTopicHeaderView.getClass();
            boolean z = true;
            if ((i & 1) != 1) {
                z = false;
            }
            if (z) {
                this.f160178d.f160170Q.onClick(view);
            } else {
                this.f160178d.mo8540c();
            }
            C58408t0.f167336a.mo83261g(false, 6);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$f */
    public static final class C56156f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160180d;

        public C56156f(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f160180d = finderFollowTopicHeaderView;
        }

        public final void onClick(View view) {
            FinderObject feedObject;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$copyrightRestrictionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C50985qn1 finderBgmInfo = this.f160180d.getFinderBgmInfo();
            Integer num = null;
            if ((finderBgmInfo != null ? finderBgmInfo.f140408e : null) != null) {
                C76912y0.makeText(this.f160180d.getContext(), (int) C0966R.string.d2n, 0).show();
            } else {
                C76912y0.makeText(this.f160180d.getContext(), (int) C0966R.string.d2m, 0).show();
            }
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            Context context = this.f160180d.getContext();
            C87412m.m108593f(context, "context");
            FinderItem originFeed = this.f160180d.getOriginFeed();
            if (!(originFeed == null || (feedObject = originFeed.getFeedObject()) == null)) {
                num = Integer.valueOf(feedObject.follow_feed_count);
            }
            y0Var.wy0(context, 2, 4, num);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$copyrightRestrictionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$g */
    public static final class C56157g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56157g(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            super(0);
            this.f160181d = finderFollowTopicHeaderView;
        }

        public Object invoke() {
            this.f160181d.mo8540c();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$h */
    public static final class C56158h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56158h(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            super(0);
            this.f160182d = finderFollowTopicHeaderView;
        }

        public Object invoke() {
            this.f160182d.mo8540c();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$i */
    public static final class C56159i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56159i(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            super(0);
            this.f160183d = finderFollowTopicHeaderView;
        }

        public Object invoke() {
            this.f160183d.f160163I = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$j */
    public static final class C56160j implements C11182m0 {

        /* renamed from: d */
        public static final C56160j f160184d = new C56160j();

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                e0Var.mo107125a(1001, C0966R.string.f7980y8);
                e0Var.mo107125a(1002, C0966R.string.f7989yh);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$k */
    public static final class C56161k implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160185d;

        /* renamed from: e */
        public final /* synthetic */ String f160186e;

        public C56161k(FinderFollowTopicHeaderView finderFollowTopicHeaderView, String str) {
            this.f160185d = finderFollowTopicHeaderView;
            this.f160186e = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00f9  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0117  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r10, int r11) {
            /*
                r9 = this;
                android.content.Intent r11 = new android.content.Intent
                r11.<init>()
                int r10 = r10.getItemId()
                r0 = 1001(0x3e9, float:1.403E-42)
                r1 = 3
                r2 = 2
                java.lang.String r3 = "key_finder_post_router"
                if (r10 == r0) goto L_0x001a
                r0 = 1002(0x3ea, float:1.404E-42)
                if (r10 == r0) goto L_0x0016
                goto L_0x001d
            L_0x0016:
                r11.putExtra(r3, r1)
                goto L_0x001d
            L_0x001a:
                r11.putExtra(r3, r2)
            L_0x001d:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                int r10 = r10.getType()
                java.lang.String r0 = "-1"
                r3 = 1
                java.lang.String r4 = ""
                r5 = 0
                if (r10 != r3) goto L_0x0056
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                java.lang.String r10 = r10.getAudioPath()
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r2 = r9.f160185d
                te3.qn1 r2 = r2.getFinderBgmInfo()
                if (r2 == 0) goto L_0x003c
                java.lang.String r2 = r2.f140410g
                goto L_0x003d
            L_0x003c:
                r2 = r5
            L_0x003d:
                if (r2 != 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r0 = r2
            L_0x0041:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r2 = r9.f160185d
                te3.qn1 r2 = r2.getFinderBgmInfo()
                if (r2 == 0) goto L_0x004c
                java.lang.String r2 = r2.f140409f
                goto L_0x004d
            L_0x004c:
                r2 = r5
            L_0x004d:
                if (r2 != 0) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r4 = r2
            L_0x0051:
                r7 = r4
                r8 = r5
            L_0x0053:
                r4 = r0
                goto L_0x00b6
            L_0x0056:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                int r10 = r10.getType()
                if (r10 != r2) goto L_0x00b3
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                jh2.j r10 = r10.getAudioInfo()
                if (r10 == 0) goto L_0x006c
                java.lang.String r10 = r10.mo10149g0()
                if (r10 != 0) goto L_0x006d
            L_0x006c:
                r10 = r4
            L_0x006d:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r2 = r9.f160185d
                te3.qn1 r2 = r2.getFinderBgmInfo()
                if (r2 == 0) goto L_0x0078
                java.lang.String r2 = r2.f140410g
                goto L_0x0079
            L_0x0078:
                r2 = r5
            L_0x0079:
                if (r2 != 0) goto L_0x007c
                goto L_0x007d
            L_0x007c:
                r0 = r2
            L_0x007d:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r2 = r9.f160185d
                te3.qn1 r2 = r2.getFinderBgmInfo()
                if (r2 == 0) goto L_0x0051
                te3.td1 r2 = r2.f140408e
                if (r2 == 0) goto L_0x0051
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r6 = r9.f160185d
                java.lang.String r7 = r2.f185539i
                if (r7 != 0) goto L_0x0090
                r7 = r4
            L_0x0090:
                te3.td1 r8 = new te3.td1
                r8.<init>()
                te3.qn1 r6 = r6.getFinderBgmInfo()
                if (r6 == 0) goto L_0x009f
                java.lang.String r6 = r6.f140410g
                if (r6 != 0) goto L_0x00a0
            L_0x009f:
                r6 = r4
            L_0x00a0:
                r8.f185534d = r6
                java.lang.String r6 = r2.f185539i
                if (r6 != 0) goto L_0x00a7
                goto L_0x00a8
            L_0x00a7:
                r4 = r6
            L_0x00a8:
                r8.f185539i = r4
                java.lang.String r4 = r2.f185537g
                r8.f185537g = r4
                java.lang.String r2 = r2.f185536f
                r8.f185536f = r2
                goto L_0x0053
            L_0x00b3:
                r10 = r4
                r7 = r10
                r8 = r5
            L_0x00b6:
                java.lang.String r0 = "KEY_FINDER_POST_ORIGIN_MUSIC_ID"
                r11.putExtra(r0, r4)
                java.lang.String r0 = "KEY_FINDER_POST_ORIGIN_MUSIC_PATH"
                r11.putExtra(r0, r10)
                if (r8 == 0) goto L_0x00c7
                byte[] r10 = r8.toByteArray()
                goto L_0x00c8
            L_0x00c7:
                r10 = r5
            L_0x00c8:
                java.lang.String r0 = "KEY_FINDER_POST_ORIGIN_MUSIC_INFO"
                r11.putExtra(r0, r10)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                te3.qn1 r10 = r10.getFinderBgmInfo()
                if (r10 == 0) goto L_0x00dc
                com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.f140407d
                if (r10 == 0) goto L_0x00dc
                java.lang.String r10 = r10.username
                goto L_0x00dd
            L_0x00dc:
                r10 = r5
            L_0x00dd:
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r0 = r0.mo90662O5()
                boolean r10 = gy3.C87412m.m108589b(r10, r0)
                java.lang.String r0 = "KEY_FINDER_POST_BGM_IF_ORIGIN"
                r11.putExtra(r0, r10)
                java.lang.String r10 = "KEY_FINDER_POST_ORIGIN_BGM_URL"
                r11.putExtra(r10, r7)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                te3.qn1 r10 = r10.getFinderBgmInfo()
                if (r10 == 0) goto L_0x00fc
                te3.td1 r10 = r10.f140408e
                goto L_0x00fd
            L_0x00fc:
                r10 = r5
            L_0x00fd:
                java.lang.String r0 = "KEY_FINDER_POST_ORIGIN_MUSIC_NAME"
                if (r10 == 0) goto L_0x0117
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                te3.qn1 r10 = r10.getFinderBgmInfo()
                if (r10 == 0) goto L_0x010f
                te3.td1 r10 = r10.f140408e
                if (r10 == 0) goto L_0x010f
                java.lang.String r5 = r10.f185536f
            L_0x010f:
                java.lang.String r10 = java.lang.String.valueOf(r5)
                r11.putExtra(r0, r10)
                goto L_0x013a
            L_0x0117:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r2 = r9.f160185d
                te3.qn1 r2 = r2.getFinderBgmInfo()
                if (r2 == 0) goto L_0x012a
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f140407d
                if (r2 == 0) goto L_0x012a
                java.lang.String r5 = r2.nickname
            L_0x012a:
                r10.append(r5)
                java.lang.String r2 = "的动态原声"
                r10.append(r2)
                java.lang.String r10 = r10.toString()
                r11.putExtra(r0, r10)
            L_0x013a:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "tabType "
                r10.append(r0)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r9.f160185d
                int r0 = r0.getTabType()
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                java.lang.String r0 = "FinderFollowTopicHeaderView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r10 = r9.f160185d
                int r10 = r10.getTabType()
                r0 = 5
                if (r10 == r3) goto L_0x016c
                if (r10 == r1) goto L_0x016c
                r1 = 4
                if (r10 == r1) goto L_0x016c
                if (r10 == r0) goto L_0x016b
                r1 = 6
                if (r10 == r1) goto L_0x016b
                goto L_0x016c
            L_0x016b:
                r0 = 7
            L_0x016c:
                java.lang.String r10 = "key_finder_post_from"
                r11.putExtra(r10, r0)
                java.lang.String r10 = r9.f160186e
                java.lang.String r0 = "key_finder_post_id"
                r11.putExtra(r0, r10)
                java.lang.Class<er1.b> r10 = er1.C58684b.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                er1.b r10 = (er1.C58684b) r10
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r9.f160185d
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r0, r1)
                r10.mo83582c0(r0, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView.C56161k.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$l */
    public static final class C56162l implements C77407n.C47880p {

        /* renamed from: a */
        public static final C56162l f160187a = new C56162l();

        public final void onDismiss() {
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.exitPageId = 6;
                FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
                if (finderFeedReportObject2 != null) {
                    C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$n */
    public static final class C56163n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160188d;

        public C56163n(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f160188d = finderFollowTopicHeaderView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0085, code lost:
            r3 = r3.getFeedObject();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseMusicListener$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160188d
                com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r8 = r8.getBgmPlayBtn()
                if (r8 == 0) goto L_0x0026
                r8.mo78356d()
            L_0x0026:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160188d
                r0 = 2131304526(0x7f09204e, float:1.8227197E38)
                android.view.View r8 = r8.findViewById(r0)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                if (r8 == 0) goto L_0x0050
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r1 = r7.f160188d
                android.content.Context r1 = r1.getContext()
                r2 = 2131755726(0x7f1002ce, float:1.914234E38)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r3 = r7.f160188d
                android.content.Context r3 = r3.getContext()
                r4 = 2131099800(0x7f060098, float:1.7811963E38)
                int r3 = kg3.C76577a.m92153d(r3, r4)
                android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r2, r3)
                r8.setImageDrawable(r1)
            L_0x0050:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160188d
                android.view.View r8 = r8.findViewById(r0)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                if (r8 == 0) goto L_0x0061
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r7.f160188d
                android.view.View$OnClickListener r0 = r0.f160168N
                r8.setOnClickListener(r0)
            L_0x0061:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160188d
                android.view.View$OnClickListener r0 = r8.f160168N
                r8.setCurrentListener(r0)
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                dp1.y0 r8 = (dp1.C58417y0) r8
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r7.f160188d
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r0, r1)
                r1 = 2
                r2 = 3
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r3 = r7.f160188d
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getOriginFeed()
                if (r3 == 0) goto L_0x0092
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                if (r3 == 0) goto L_0x0092
                int r3 = r3.follow_feed_count
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0093
            L_0x0092:
                r3 = 0
            L_0x0093:
                r8.wy0(r0, r1, r2, r3)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseMusicListener$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView.C56163n.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$o */
    public static final class C56164o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160189d;

        public C56164o(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f160189d = finderFollowTopicHeaderView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0077, code lost:
            r0 = r0.getFeedObject();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseVideoListener$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160189d
                com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic r8 = r8.getVideoView()
                if (r8 == 0) goto L_0x0088
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r7.f160189d
                r1 = 2131304526(0x7f09204e, float:1.8227197E38)
                android.view.View r2 = r0.findViewById(r1)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
                if (r2 == 0) goto L_0x0049
                android.content.Context r3 = r0.getContext()
                r4 = 2131755726(0x7f1002ce, float:1.914234E38)
                android.content.Context r5 = r0.getContext()
                r6 = 2131099800(0x7f060098, float:1.7811963E38)
                int r5 = kg3.C76577a.m92153d(r5, r6)
                android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r5)
                r2.setImageDrawable(r3)
            L_0x0049:
                r8.pause()
                android.view.View r8 = r0.findViewById(r1)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                if (r8 == 0) goto L_0x0059
                android.view.View$OnClickListener r1 = r0.f160166L
                r8.setOnClickListener(r1)
            L_0x0059:
                android.view.View$OnClickListener r8 = r0.f160166L
                r0.setCurrentListener(r8)
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                dp1.y0 r8 = (dp1.C58417y0) r8
                android.content.Context r1 = r0.getContext()
                java.lang.String r2 = "context"
                gy3.C87412m.m108593f(r1, r2)
                r2 = 2
                r3 = 3
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.getOriginFeed()
                if (r0 == 0) goto L_0x0084
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                if (r0 == 0) goto L_0x0084
                int r0 = r0.follow_feed_count
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0085
            L_0x0084:
                r0 = 0
            L_0x0085:
                r8.wy0(r1, r2, r3, r0)
            L_0x0088:
                java.lang.String r8 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseVideoListener$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView.C56164o.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$p */
    public static final class C56165p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160190d;

        public C56165p(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f160190d = finderFollowTopicHeaderView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0083, code lost:
            r1 = r1.getFeedObject();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$playMusicListener$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160190d
                com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r8 = r8.getBgmPlayBtn()
                if (r8 == 0) goto L_0x0026
                r8.mo78357e()
            L_0x0026:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160190d
                r0 = 2131304526(0x7f09204e, float:1.8227197E38)
                android.view.View r8 = r8.findViewById(r0)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                if (r8 == 0) goto L_0x0050
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r1 = r7.f160190d
                android.content.Context r1 = r1.getContext()
                r2 = 2131755725(0x7f1002cd, float:1.9142337E38)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r3 = r7.f160190d
                android.content.Context r3 = r3.getContext()
                r4 = 2131099800(0x7f060098, float:1.7811963E38)
                int r3 = kg3.C76577a.m92153d(r3, r4)
                android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r2, r3)
                r8.setImageDrawable(r1)
            L_0x0050:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160190d
                android.view.View r8 = r8.findViewById(r0)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                if (r8 == 0) goto L_0x0061
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r7.f160190d
                android.view.View$OnClickListener r0 = r0.f160169P
                r8.setOnClickListener(r0)
            L_0x0061:
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160190d
                android.view.View$OnClickListener r0 = r8.f160169P
                r8.setCurrentListener(r0)
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                dp1.y0 r8 = (dp1.C58417y0) r8
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r7.f160190d
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r0, r1)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r1 = r7.f160190d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.getOriginFeed()
                if (r1 == 0) goto L_0x0090
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                if (r1 == 0) goto L_0x0090
                int r1 = r1.follow_feed_count
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0091
            L_0x0090:
                r1 = 0
            L_0x0091:
                r2 = 2
                r8.wy0(r0, r2, r2, r1)
                java.lang.String r8 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$playMusicListener$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView.C56165p.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$q */
    public static final class C56166q implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowTopicHeaderView f160191d;

        public C56166q(FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
            this.f160191d = finderFollowTopicHeaderView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
            r0 = r0.getFeedObject();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$playVideoListener$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r8 = r7.f160191d
                com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic r8 = r8.getVideoView()
                if (r8 == 0) goto L_0x0099
                com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView r0 = r7.f160191d
                boolean r1 = r0.f160175z
                if (r1 == 0) goto L_0x0037
                r1 = 0
                r0.setFirstClickPlay(r1)
                r8.setMute(r1)
                r1 = 0
                r3 = 1
                r8.mo79613a(r1, r3)
                goto L_0x003a
            L_0x0037:
                r8.play()
            L_0x003a:
                r8 = 2131304526(0x7f09204e, float:1.8227197E38)
                android.view.View r1 = r0.findViewById(r8)
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
                if (r1 == 0) goto L_0x005e
                android.content.Context r2 = r0.getContext()
                r3 = 2131755725(0x7f1002cd, float:1.9142337E38)
                android.content.Context r4 = r0.getContext()
                r5 = 2131099800(0x7f060098, float:1.7811963E38)
                int r4 = kg3.C76577a.m92153d(r4, r5)
                android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r4)
                r1.setImageDrawable(r2)
            L_0x005e:
                android.view.View r8 = r0.findViewById(r8)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                if (r8 == 0) goto L_0x006b
                android.view.View$OnClickListener r1 = r0.f160167M
                r8.setOnClickListener(r1)
            L_0x006b:
                android.view.View$OnClickListener r8 = r0.f160167M
                r0.setCurrentListener(r8)
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                dp1.y0 r8 = (dp1.C58417y0) r8
                android.content.Context r1 = r0.getContext()
                java.lang.String r2 = "context"
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.getOriginFeed()
                if (r0 == 0) goto L_0x0094
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                if (r0 == 0) goto L_0x0094
                int r0 = r0.follow_feed_count
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0095
            L_0x0094:
                r0 = 0
            L_0x0095:
                r2 = 2
                r8.wy0(r1, r2, r2, r0)
            L_0x0099:
                java.lang.String r8 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$playVideoListener$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView.C56166q.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowTopicHeaderView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo78332s(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8539a(com.tencent.p014mm.plugin.finder.storage.FinderItem r29, te3.C50985qn1 r30, int r31, int r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r32
            java.lang.Class<rw.n> r4 = p232rw.C13586n.class
            r0.f160172w = r1
            r0.f160173x = r2
            r5 = r31
            r0.f160162H = r5
            if (r2 == 0) goto L_0x0017
            te3.td1 r6 = r2.f140408e
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            r7 = 2131304523(0x7f09204b, float:1.822719E38)
            java.lang.String r8 = ""
            java.lang.String r9 = "context"
            r10 = 2131302678(0x7f091916, float:1.8223449E38)
            r11 = 2131304525(0x7f09204d, float:1.8227195E38)
            r12 = 2131304526(0x7f09204e, float:1.8227197E38)
            r14 = 2
            r15 = 0
            r5 = 2131305072(0x7f092270, float:1.8228305E38)
            r13 = 1
            if (r6 == 0) goto L_0x0129
            r0.f160158D = r14
            te3.td1 r1 = r2.f140408e
            java.lang.String r6 = " · "
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = r1.f185537g
            if (r1 == 0) goto L_0x0044
            boolean r1 = z04.C112550d0.m153801u(r1, r6, r15)
            if (r1 != r13) goto L_0x0044
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            if (r1 == 0) goto L_0x0068
            te3.td1 r1 = r2.f140408e
            if (r1 == 0) goto L_0x006f
            java.lang.String r1 = r1.f185537g
            if (r1 == 0) goto L_0x006f
            java.lang.String[] r17 = new java.lang.String[]{r6}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r1
            java.util.List r1 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r1.get(r15)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0070
        L_0x0068:
            te3.td1 r1 = r2.f140408e
            if (r1 == 0) goto L_0x006f
            java.lang.String r1 = r1.f185537g
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            android.view.View r6 = r0.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L_0x0079
            goto L_0x0080
        L_0x0079:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6.setText(r1)
        L_0x0080:
            android.view.View r1 = r0.findViewById(r7)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            te3.td1 r6 = r2.f140408e
            if (r6 == 0) goto L_0x0090
            java.lang.String r6 = r6.f185536f
            goto L_0x0091
        L_0x0090:
            r6 = 0
        L_0x0091:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r1.setText(r6)
        L_0x0098:
            r1 = r3 & 1
            if (r1 != r13) goto L_0x009e
            r1 = 1
            goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x00ba
            android.view.View r1 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 == 0) goto L_0x00ae
            android.view.View$OnClickListener r2 = r0.f160170Q
            r1.setOnClickListener(r2)
        L_0x00ae:
            android.view.View r1 = r0.findViewById(r5)
            if (r1 == 0) goto L_0x00b9
            android.view.View$OnClickListener r2 = r0.f160170Q
            r1.setOnClickListener(r2)
        L_0x00b9:
            return
        L_0x00ba:
            android.view.View r1 = r0.findViewById(r11)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r1 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r1
            r0.f160160F = r1
            if (r1 == 0) goto L_0x00c9
            te3.td1 r6 = r2.f140408e
            r1.mo78354a(r6)
        L_0x00c9:
            android.view.View r1 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 == 0) goto L_0x00d6
            android.view.View$OnClickListener r6 = r0.f160168N
            r1.setOnClickListener(r6)
        L_0x00d6:
            di3.d r1 = di3.C86312j.m106911c(r4)
            rw.n r1 = (p232rw.C13586n) r1
            jh2.j r1 = r1.d70()
            long r6 = java.lang.System.currentTimeMillis()
            int r7 = (int) r6
            r1.mo10147b(r7)
            te3.td1 r6 = r2.f140408e
            if (r6 == 0) goto L_0x00ef
            java.lang.String r6 = r6.f185539i
            goto L_0x00f0
        L_0x00ef:
            r6 = 0
        L_0x00f0:
            r1.mo10148c(r6)
            er1.j5 r6 = er1.C58741j5.f168184a
            te3.td1 r2 = r2.f140408e
            gy3.C87412m.m108591d(r2)
            java.lang.String r2 = r6.mo83729c(r2)
            r1.mo10146a(r2)
            java.lang.String r2 = r1.mo10149g0()
            if (r2 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r8 = r2
        L_0x0109:
            r0.f160159E = r8
            r0.f160157C = r1
            di3.d r1 = di3.C86312j.m106911c(r4)
            rw.n r1 = (p232rw.C13586n) r1
            android.content.Context r2 = r28.getContext()
            gy3.C87412m.m108593f(r2, r9)
            jh2.j r4 = r0.f160157C
            gy3.C87412m.m108591d(r4)
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$a r6 = new com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$a
            r6.<init>(r0)
            r1.Bt0(r2, r4, r6)
            goto L_0x03ac
        L_0x0129:
            r0.f160158D = r13
            if (r2 == 0) goto L_0x01c3
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r2.f140407d
            if (r6 == 0) goto L_0x01c3
            android.view.View r6 = r0.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L_0x013a
            goto L_0x0149
        L_0x013a:
            com.tencent.mm.protocal.protobuf.FinderContact r14 = r2.f140407d
            if (r14 == 0) goto L_0x0141
            java.lang.String r14 = r14.nickname
            goto L_0x0142
        L_0x0141:
            r14 = 0
        L_0x0142:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r6.setText(r14)
        L_0x0149:
            android.view.View r6 = r0.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 != 0) goto L_0x0152
            goto L_0x016c
        L_0x0152:
            android.content.Context r7 = r28.getContext()
            r14 = 2131826684(0x7f1117fc, float:1.928626E38)
            java.lang.Object[] r5 = new java.lang.Object[r13]
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r2.f140407d
            if (r11 == 0) goto L_0x0162
            java.lang.String r11 = r11.nickname
            goto L_0x0163
        L_0x0162:
            r11 = 0
        L_0x0163:
            r5[r15] = r11
            java.lang.String r5 = r7.getString(r14, r5)
            r6.setText(r5)
        L_0x016c:
            android.view.View r5 = r0.findViewById(r10)
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$b r6 = new com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$b
            r6.<init>(r2, r0)
            r5.setOnClickListener(r6)
            r5 = 2131302905(0x7f0919f9, float:1.822391E38)
            android.view.View r5 = r0.findViewById(r5)
            if (r5 != 0) goto L_0x0182
            goto L_0x01c3
        L_0x0182:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r6.mo10233c(r7)
            java.lang.Object[] r20 = r6.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r22 = "bindOriginFeed"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r5
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r6 = r6.mo10231a(r15)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r21 = "bindOriginFeed"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x01c3:
            r5 = r3 & 1
            if (r5 != r13) goto L_0x01c9
            r5 = 1
            goto L_0x01ca
        L_0x01c9:
            r5 = 0
        L_0x01ca:
            if (r5 == 0) goto L_0x01da
            android.view.View r1 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 == 0) goto L_0x01d9
            android.view.View$OnClickListener r2 = r0.f160170Q
            r1.setOnClickListener(r2)
        L_0x01d9:
            return
        L_0x01da:
            if (r2 == 0) goto L_0x01df
            java.lang.String r5 = r2.f140409f
            goto L_0x01e0
        L_0x01df:
            r5 = 0
        L_0x01e0:
            if (r5 == 0) goto L_0x01eb
            int r5 = r5.length()
            if (r5 != 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r5 = 0
            goto L_0x01ec
        L_0x01eb:
            r5 = 1
        L_0x01ec:
            if (r5 == 0) goto L_0x032e
            r5 = 2131304525(0x7f09204d, float:1.8227195E38)
            android.view.View r2 = r0.findViewById(r5)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r2 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r2
            r0.f160160F = r2
            android.view.View r2 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            if (r2 == 0) goto L_0x0206
            android.view.View$OnClickListener r4 = r0.f160166L
            r2.setOnClickListener(r4)
        L_0x0206:
            if (r1 != 0) goto L_0x0275
            r2 = 2131305072(0x7f092270, float:1.8228305E38)
            android.view.View r1 = r0.findViewById(r2)
            if (r1 != 0) goto L_0x0212
            goto L_0x0255
        L_0x0212:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r5)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r22 = "bindOriginFeed"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r21 = "bindOriginFeed"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0255:
            android.view.View r1 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 != 0) goto L_0x025e
            goto L_0x0263
        L_0x025e:
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r2)
        L_0x0263:
            android.view.View r1 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            if (r1 == 0) goto L_0x03ac
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$c r2 = new com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$c
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x03ac
        L_0x0275:
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r4 = r28.getContext()
            gy3.C87412m.m108593f(r4, r9)
            bl3.r$a r2 = r2.mo62443b(r4)
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(context).…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            rs1.s8 r2 = (rs1.C13442s8) r2
            com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic r4 = r0.f160171v
            if (r4 == 0) goto L_0x03ac
            pl1.r0 r5 = new pl1.r0
            java.util.LinkedList r6 = r29.getMediaList()
            java.lang.Object r6 = r6.get(r15)
            java.lang.String r7 = "feed.mediaList[0]"
            gy3.C87412m.m108593f(r6, r7)
            r20 = r6
            te3.rq2 r20 = (te3.C64689rq2) r20
            up1.y r21 = up1.C27696y.V10_VIDEO
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 56
            r27 = 0
            java.lang.String r22 = "xV10"
            r19 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r0.f160174y = r5
            java.lang.String r5 = r5.getPath()
            r0.f160159E = r5
            pl1.r0 r5 = r0.f160174y
            if (r5 == 0) goto L_0x02ce
            java.lang.String r5 = r5.getPath()
            if (r5 != 0) goto L_0x02cd
            goto L_0x02ce
        L_0x02cd:
            r8 = r5
        L_0x02ce:
            boolean r5 = r0.mo78347t(r8)
            r0.f160156B = r5
            boolean r5 = r0.f160156B
            if (r5 == 0) goto L_0x02e0
            pl1.r0 r5 = r0.f160174y
            gy3.C87412m.m108591d(r5)
            r0.mo78331r(r5)
        L_0x02e0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "file downloadFinish = "
            r5.append(r6)
            boolean r6 = r0.f160156B
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderFollowTopicHeaderView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            pl1.r0 r5 = r0.f160174y
            gy3.C87412m.m108591d(r5)
            com.tencent.mm.plugin.finder.storage.FeedData$a r6 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r6.mo78884b(r1)
            r4.mo79632m0(r5, r15, r1)
            com.tencent.mm.pluginsdk.ui.a$e r1 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r4.setScaleType(r1)
            pl1.p0 r1 = new pl1.p0
            int r2 = r2.f38096i
            r5 = 2
            r6 = 0
            r1.<init>(r2, r6, r5, r6)
            pl1.r0 r2 = r0.f160174y
            gy3.C87412m.m108591d(r2)
            com.tencent.mm.modelvideo.a r1 = r1.mo87415a(r2, r0)
            r4.setIOnlineVideoProxy(r1)
            r4.setIsShowBasicControls(r15)
            r4.setLoop(r13)
            r4.setMute(r13)
            r4.start()
            goto L_0x03ac
        L_0x032e:
            if (r2 == 0) goto L_0x03ac
            r1 = 2131304525(0x7f09204d, float:1.8227195E38)
            android.view.View r5 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r5 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r5
            r0.f160160F = r5
            te3.td1 r1 = new te3.td1
            r1.<init>()
            java.lang.String r2 = r2.f140409f
            r1.f185539i = r2
            java.lang.String r2 = "fake music info"
            r1.f185536f = r2
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r1.f185534d = r2
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r2 = r0.f160160F
            if (r2 == 0) goto L_0x0359
            r2.mo78354a(r1)
        L_0x0359:
            android.view.View r2 = r0.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            if (r2 == 0) goto L_0x0366
            android.view.View$OnClickListener r5 = r0.f160168N
            r2.setOnClickListener(r5)
        L_0x0366:
            di3.d r2 = di3.C86312j.m106911c(r4)
            rw.n r2 = (p232rw.C13586n) r2
            jh2.j r2 = r2.d70()
            long r5 = java.lang.System.currentTimeMillis()
            int r6 = (int) r5
            r2.mo10147b(r6)
            java.lang.String r5 = r1.f185539i
            r2.mo10148c(r5)
            er1.j5 r5 = er1.C58741j5.f168184a
            java.lang.String r1 = r5.mo83729c(r1)
            r2.mo10146a(r1)
            java.lang.String r1 = r2.mo10149g0()
            if (r1 != 0) goto L_0x038d
            goto L_0x038e
        L_0x038d:
            r8 = r1
        L_0x038e:
            r0.f160159E = r8
            r0.f160157C = r2
            di3.d r1 = di3.C86312j.m106911c(r4)
            rw.n r1 = (p232rw.C13586n) r1
            android.content.Context r2 = r28.getContext()
            gy3.C87412m.m108593f(r2, r9)
            jh2.j r4 = r0.f160157C
            gy3.C87412m.m108591d(r4)
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$d r5 = new com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$d
            r5.<init>(r0)
            r1.Bt0(r2, r4, r5)
        L_0x03ac:
            r1 = 2131304525(0x7f09204d, float:1.8227195E38)
            android.view.View r1 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r1 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r1
            if (r1 == 0) goto L_0x03bc
            android.view.ViewParent r6 = r1.getParent()
            goto L_0x03bd
        L_0x03bc:
            r6 = 0
        L_0x03bd:
            boolean r2 = r6 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x03c4
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x03c5
        L_0x03c4:
            r6 = 0
        L_0x03c5:
            if (r6 == 0) goto L_0x03ca
            r6.removeView(r1)
        L_0x03ca:
            android.content.Context r2 = r28.getContext()
            android.app.Activity r2 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r2)
            if (r2 == 0) goto L_0x03e6
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.FrameLayout"
            gy3.C87412m.m108592e(r2, r4)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.addView(r1)
        L_0x03e6:
            er1.w3 r1 = er1.C58784w3.f168295a
            r2 = 0
            int r1 = er1.C58784w3.m68441q(r1, r2, r13, r2)
            if (r1 != r13) goto L_0x043e
            r1 = 2131305072(0x7f092270, float:1.8228305E38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 != 0) goto L_0x03fa
            goto L_0x049f
        L_0x03fa:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r5 = "bindOriginFeed"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r4 = "bindOriginFeed"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x049f
        L_0x043e:
            dp1.t0 r1 = dp1.C58408t0.f167336a
            r2 = 6
            r1.mo83261g(r13, r2)
            r1 = 2131305072(0x7f092270, float:1.8228305E38)
            android.view.View r2 = r0.findViewById(r1)
            if (r2 != 0) goto L_0x044e
            goto L_0x048e
        L_0x044e:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r1.mo10233c(r4)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r7 = "bindOriginFeed"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r1.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView"
            java.lang.String r6 = "bindOriginFeed"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;Lcom/tencent/mm/protocal/protobuf/FinderTopicBgmInfo;II)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x048e:
            r1 = 2131305072(0x7f092270, float:1.8228305E38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x049f
            com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$e r2 = new com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView$e
            r2.<init>(r0, r3)
            r1.setOnClickListener(r2)
        L_0x049f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderFollowTopicHeaderView.mo8539a(com.tencent.mm.plugin.finder.storage.FinderItem, te3.qn1, int, int):void");
    }

    /* renamed from: c */
    public void mo8540c() {
        String str;
        C89779i0 i0Var;
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        Intent intent = activity != null ? activity.getIntent() : null;
        if (intent == null || (str = intent.getStringExtra("KEY_FOLLOW_ID")) == null) {
            str = "";
        }
        boolean z = false;
        int intExtra = intent != null ? intent.getIntExtra("key_from_comment_scene", 0) : 0;
        if (intent != null) {
            intent.putExtra("key_ref_feed_id", C61926c.m72671P(str));
        }
        if (intent != null) {
            intent.putExtra("key_ref_comment_scene", intExtra);
        }
        C58408t0 t0Var = C58408t0.f167336a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        t0Var.mo83263i(context2, 41);
        switch (C58784w3.m68441q(C58784w3.f168295a, (String) null, 1, (Object) null)) {
            case 1:
                C76912y0.makeText(getContext(), (int) C0966R.string.ef4, 0).show();
                return;
            case 2:
                C4191v0 v0Var = new C4191v0(getContext());
                v0Var.mo5070e(C0966R.C0971layout.abv);
                v0Var.f18463f.findViewById(C0966R.C0970id.apu).setOnClickListener(new C7360a(v0Var));
                v0Var.f18463f.findViewById(C0966R.C0970id.bvz).setOnClickListener(new C7361b(this, v0Var));
                v0Var.mo5073h();
                return;
            case 3:
            case 6:
                break;
            case 4:
                C76912y0.makeText(getContext(), (int) C0966R.string.cxr, 0).show();
                return;
            case 5:
                C76912y0.makeText(getContext(), (int) C0966R.string.enw, 0).show();
                return;
            default:
                Log.m105918d("FinderFollowTopicHeaderView", "not one of six state");
                break;
        }
        if (!this.f160156B) {
            C89779i0 i0Var2 = this.f160155A;
            if (i0Var2 == null) {
                this.f160155A = C89779i0.m112248e(getContext(), getContext().getString(C0966R.string.d_t), true, 2, (DialogInterface.OnCancelListener) null);
                return;
            }
            if (i0Var2 != null && !i0Var2.isShowing()) {
                z = true;
            }
            if (z && (i0Var = this.f160155A) != null) {
                i0Var.show();
            }
        } else if (!C11767a.f34453a.mo11659a("post")) {
            C87412m.m108593f(getContext(), "context");
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            t0Var.mo83266l(6, false);
            C0145d1 d1Var = this.f160164J;
            if (d1Var != null && !d1Var.mo136d3(new C56158h(this), new C56159i(this))) {
                z = true;
            }
            if (!z) {
                String str2 = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
                t0Var.mo83265k(str2, (String) null);
                C0143d dVar = C0143d.f574a;
                Context context3 = getContext();
                C87412m.m108593f(context3, "context");
                C77407n a = dVar.mo134a(context3);
                a.f225771i = C56160j.f160184d;
                a.f225782p = new C56161k(this, str2);
                a.f225761d = C56162l.f160187a;
                a.mo107573q();
            }
        }
    }

    /* renamed from: e */
    public void mo78310e(int i, int i2, C62369u0 u0Var) {
        C87412m.m108594g(u0Var, "video");
        Log.m105924i("FinderFollowTopicHeaderView", "[onProgressDownload] offset:" + i + ',' + i2);
    }

    /* renamed from: g */
    public void mo78311g(C62369u0 u0Var) {
        C87412m.m108594g(u0Var, "video");
        Log.m105924i("FinderFollowTopicHeaderView", "[onStartDownload]");
    }

    public final C9434j getAudioInfo() {
        return this.f160157C;
    }

    public final String getAudioPath() {
        return this.f160161G;
    }

    public final FinderImgFeedMusicTag getBgmPlayBtn() {
        return this.f160160F;
    }

    public final View.OnClickListener getCurrentListener() {
        return this.f160165K;
    }

    public final C89779i0 getDialog() {
        return this.f160155A;
    }

    public final boolean getDownloadFinish() {
        return this.f160156B;
    }

    public final String getFilePath() {
        return this.f160159E;
    }

    public final C50985qn1 getFinderBgmInfo() {
        return this.f160173x;
    }

    public final C62367r0 getMedia() {
        return this.f160174y;
    }

    public final FinderItem getOriginFeed() {
        return this.f160172w;
    }

    public final int getTabType() {
        return this.f160162H;
    }

    public final int getType() {
        return this.f160158D;
    }

    public final FinderVideoViewForTopic getVideoView() {
        return this.f160171v;
    }

    /* renamed from: h */
    public void mo78325h(C62369u0 u0Var, C98127h hVar, C98121d dVar) {
        C87412m.m108594g(u0Var, "video");
        Log.m105924i("FinderFollowTopicHeaderView", "[onStopDownload]");
    }

    /* renamed from: i */
    public void mo78326i(String str, int i, int i2) {
        C87412m.m108594g(str, "mediaId");
        Log.m105924i("FinderFollowTopicHeaderView", "[checkVideoDataAvailable]");
    }

    /* renamed from: j */
    public void mo78327j(int i, int i2, C62369u0 u0Var, boolean z) {
        C87412m.m108594g(u0Var, "video");
        Log.m105924i("FinderFollowTopicHeaderView", "[onMoovReadyDownload]");
    }

    /* renamed from: k */
    public void mo8541k() {
        FinderImgFeedMusicTag finderImgFeedMusicTag = this.f160160F;
        if (finderImgFeedMusicTag != null) {
            finderImgFeedMusicTag.mo78358f();
        }
        FinderVideoViewForTopic finderVideoViewForTopic = this.f160171v;
        if (finderVideoViewForTopic != null) {
            finderVideoViewForTopic.stop();
        }
        C86709a0.m107524d().mo123470p(7289, this);
    }

    /* renamed from: l */
    public void mo78328l(int i, C62369u0 u0Var, C98121d dVar) {
        C87412m.m108594g(u0Var, "video");
        StringBuilder sb = new StringBuilder();
        sb.append("[onFinishDownload] videoPath = ");
        C62367r0 r0Var = (C62367r0) u0Var;
        sb.append(r0Var.getPath());
        Log.m105924i("FinderFollowTopicHeaderView", sb.toString());
        boolean z = true;
        this.f160156B = i == 0;
        if (!this.f160156B) {
            C76701a.makeText(getContext(), (int) C0966R.string.d_v, 0).show();
            C115669n.INSTANCE.mo175913w(1530, 1, 1);
        } else if (this.f160173x != null) {
            mo78331r(u0Var);
            C89779i0 i0Var = this.f160155A;
            if (i0Var == null || !i0Var.isShowing()) {
                z = false;
            }
            if (z) {
                C89779i0 i0Var2 = this.f160155A;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                C61926c.m72668M(new C56157g(this));
            }
            Log.m105924i("FinderFollowTopicHeaderView", "[onFinishDownload] ret = " + i + ",fileExist = " + C48020a.m53385b(r0Var.getPath()) + ",fileSize = " + C48020a.m53386c(r0Var.getPath()));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105918d("FinderFollowTopicHeaderView", "[onDetachedFromWindow] onViewRecycled");
    }

    public void onResume() {
        if (this.f160163I == null) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C53895h.m60466d(((MMActivity) context).getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C3266m((C15601d<? super C3266m>) null), 3, (Object) null);
        }
        C0145d1 d1Var = this.f160164J;
        if (d1Var != null) {
            d1Var.onResume();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (yVar != null && yVar.getType() == 7289) {
            z = true;
        }
        if (z) {
            C114799u reqResp = yVar.getReqResp();
            C50119ke1 ke12 = null;
            C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            if (aVar instanceof C50119ke1) {
                ke12 = (C50119ke1) aVar;
            }
            C0145d1 d1Var = this.f160164J;
            if (d1Var != null) {
                d1Var.onSceneEnd(i, i2, str, yVar);
            }
            if (i == 0 && i2 == 0) {
                this.f160163I = ke12;
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        WeImageView weImageView;
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        if ((C87412m.m108589b(this.f160165K, this.f160167M) || C87412m.m108589b(this.f160165K, this.f160169P)) && (weImageView = (WeImageView) findViewById(C0966R.C0970id.e3p)) != null) {
            weImageView.performClick();
        }
    }

    /* renamed from: r */
    public final void mo78331r(C62369u0 u0Var) {
        C50985qn1 qn12 = this.f160173x;
        if (qn12 != null) {
            String str = qn12.f140409f;
            if (str == null || str.length() == 0) {
                C58741j5 j5Var = C58741j5.f168184a;
                String str2 = qn12.f140410g;
                if (str2 == null) {
                    str2 = "emptyid_" + System.currentTimeMillis();
                }
                C87412m.m108593f(str2, "it.groupId?:\"emptyid_${S…tem.currentTimeMillis()}\"");
                String str3 = C58741j5.f168192i + str2;
                if (mo78347t(str3)) {
                    Log.m105924i("FinderFollowTopicHeaderView", "audio length = " + ((((float) C48020a.m53386c(str3)) / 1024.0f) / 1024.0f) + 'M');
                    this.f160161G = str3;
                    return;
                }
                Log.m105924i("FinderFollowTopicHeaderView", "audio:" + str3 + " track no exist");
                if (((C65000f) C86312j.m106911c(C65000f.class)).mo89177TB(((C62367r0) u0Var).getPath(), str3)) {
                    Log.m105924i("FinderFollowTopicHeaderView", "[SimpleAudioExtractor] true");
                    Log.m105924i("FinderFollowTopicHeaderView", "audio length = " + ((((float) C48020a.m53386c(str3)) / 1024.0f) / 1024.0f) + 'M');
                    C63679m.C63680a oC = ((C63679m) C86312j.m106911c(C63679m.class)).mo88485oC(str3);
                    if (oC == null || oC.f180528d == 0) {
                        Log.m105924i("FinderFollowTopicHeaderView", "no audio track");
                        this.f160156B = false;
                        View findViewById = findViewById(C0966R.C0970id.ec5);
                        if (findViewById != null) {
                            findViewById.setOnClickListener(this.f160170Q);
                            return;
                        }
                        return;
                    }
                    this.f160161G = str3;
                    return;
                }
                Log.m105924i("FinderFollowTopicHeaderView", "[SimpleAudioExtractor] false");
                C76701a.makeText(getContext(), (int) C0966R.string.d_v, 0).show();
                this.f160156B = false;
                View findViewById2 = findViewById(C0966R.C0970id.ec5);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(this.f160170Q);
                }
                C115669n.INSTANCE.mo175913w(1530, 0, 1);
            }
        }
    }

    /* renamed from: s */
    public final void mo78332s(Context context) {
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.abu, this, true);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
        this.f160171v = (FinderVideoViewForTopic) findViewById(C0966R.C0970id.l7x);
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.ec8)).getPaint(), 0.8f);
        C86709a0.m107524d().mo123455a(7289, this);
        this.f160164J = new C0145d1((AppCompatActivity) context);
    }

    public final void setAudioInfo(C9434j jVar) {
        this.f160157C = jVar;
    }

    public final void setAudioPath(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f160161G = str;
    }

    public final void setBgmPlayBtn(FinderImgFeedMusicTag finderImgFeedMusicTag) {
        this.f160160F = finderImgFeedMusicTag;
    }

    public final void setCurrentListener(View.OnClickListener onClickListener) {
        this.f160165K = onClickListener;
    }

    public final void setDialog(C89779i0 i0Var) {
        this.f160155A = i0Var;
    }

    public final void setDownloadFinish(boolean z) {
        this.f160156B = z;
    }

    public final void setFilePath(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f160159E = str;
    }

    public final void setFinderBgmInfo(C50985qn1 qn12) {
        this.f160173x = qn12;
    }

    public final void setFirstClickPlay(boolean z) {
        this.f160175z = z;
    }

    public final void setMedia(C62367r0 r0Var) {
        this.f160174y = r0Var;
    }

    public final void setOriginFeed(FinderItem finderItem) {
        this.f160172w = finderItem;
    }

    public final void setTabType(int i) {
        this.f160162H = i;
    }

    public final void setType(int i) {
        this.f160158D = i;
    }

    public final void setVideoView(FinderVideoViewForTopic finderVideoViewForTopic) {
        this.f160171v = finderVideoViewForTopic;
    }

    /* renamed from: t */
    public final boolean mo78347t(String str) {
        return C48020a.m53385b(str) && C48020a.m53386c(str) > 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowTopicHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo78332s(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowTopicHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo78332s(context);
    }
}
