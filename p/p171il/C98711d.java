package p171il;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import i61.C98602h;
import ke3.C88144b;
import nj3.C76879j;
import p490dl.C97491p;
import p585kl.C76595c;
import p585kl.C99145a;
import p585kl.C99146d;
import p585kl.C99150i;
import p733vy.C37873b;
import p813fl.C97903f0;
import p813fl.C97904g;
import p813fl.C97927q0;
import p813fl.C97938w;
import p813fl.C97939w0;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C49978jd3;
import u61.C101964h;
import v61.C37682c;
import z04.C112550d0;
import z04.C112551y;
import z51.C39315g;

/* renamed from: il.d */
public class C98711d implements C60337u {

    /* renamed from: a */
    public int f289453a;

    /* renamed from: b */
    public C72837v1 f289454b;

    /* renamed from: c */
    public ChatFooterPanel.C72719a f289455c;

    /* renamed from: d */
    public String f289456d;

    /* renamed from: e */
    public C32224a<C13598b0> f289457e;

    /* renamed from: il.d$a */
    public /* synthetic */ class C98712a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f289458a;

        static {
            int[] iArr = new int[IEmojiInfo.C40006b.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            iArr[5] = 5;
            iArr[6] = 6;
            iArr[7] = 7;
            iArr[8] = 8;
            iArr[9] = 9;
            iArr[10] = 10;
            int[] iArr2 = new int[IEmojiInfo.C40005a.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[3] = 3;
            iArr2[2] = 4;
            iArr2[4] = 5;
            f289458a = iArr2;
        }
    }

    public C98711d(int i) {
        this.f289453a = i;
    }

    /* renamed from: d */
    public static final void m128483d(C98711d dVar, Context context, IEmojiInfo iEmojiInfo) {
        dVar.getClass();
        Class cls = C39315g.class;
        IEmojiInfo.C40005a T1 = iEmojiInfo.mo62647T1();
        iEmojiInfo.mo62659e2(IEmojiInfo.C40005a.STATUS_UPLOADING);
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138019f(emojiInfo);
        emojiInfo.mo62659e2(T1);
        ((C39315g) C86312j.m106911c(cls)).getProvider().mo138023j(emojiInfo.getMd5());
    }

    /* renamed from: a */
    public void mo85308a(ChatFooterPanel.C72719a aVar) {
        this.f289455c = aVar;
    }

    /* renamed from: b */
    public void mo127710b(View view, Context context, int i, C97927q0 q0Var) {
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
        IEmojiInfo iEmojiInfo;
        String localClassName;
        int i2;
        String str;
        int i3;
        C32224a<C13598b0> aVar;
        Activity activity = context;
        C97927q0 q0Var2 = q0Var;
        Class cls = C37873b.class;
        Class cls2 = C39315g.class;
        C87412m.m108594g(activity, "context");
        Log.m105924i("MicroMsg.EmojiPanelClickListener", "onClick: " + i + ", " + q0Var2);
        if (q0Var2 != null) {
            C99150i.m129154a().f290710c = this.f289453a;
            C76595c.m92188a().f224190c = this.f289453a;
            int i4 = q0Var2.f287255a;
            if (i4 == 0) {
                IEmojiInfo iEmojiInfo2 = ((C97904g) q0Var2).f287200b;
                if (C101964h.m134228j(iEmojiInfo2)) {
                    iEmojiInfo = ((C39315g) C86312j.m106911c(cls2)).getProvider().mo138027m((EmojiInfo) iEmojiInfo2);
                    C87412m.m108593f(iEmojiInfo, "getService(IEmojiMgrProv…fo?\n                    )");
                } else {
                    iEmojiInfo = iEmojiInfo2;
                }
                C99150i a = C99150i.m129154a();
                String md5 = iEmojiInfo2.getMd5();
                String groupId = iEmojiInfo2.getGroupId();
                String o0 = iEmojiInfo2.mo62685o0();
                String n = iEmojiInfo2.mo62684n();
                a.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                C115669n.INSTANCE.mo160131h(16029, md5, groupId, o0, n, Integer.valueOf(a.f290710c), Long.valueOf(currentTimeMillis - a.f290708a), Integer.valueOf(a.f290709b), Integer.valueOf(a.f290711d), Integer.valueOf(a.f290712e), 0, Integer.valueOf(i), Integer.valueOf(a.f290713f), 0, 0, Integer.valueOf(a.f290714g), a.f290715h, Long.valueOf(currentTimeMillis), Long.valueOf(a.f290708a), Integer.valueOf(a.f290718k), a.f290716i, Integer.valueOf(a.f290717j));
                a.f290709b++;
                C72837v1 v1Var = this.f289454b;
                if (v1Var != null) {
                    v1Var.mo65586X1((EmojiInfo) iEmojiInfo);
                }
            } else if (i4 == 1) {
                C97939w0 w0Var = (C97939w0) q0Var2;
                ((C39315g) C86312j.m106911c(cls2)).getProvider().mo138028n(w0Var.f287274b.f166996a);
                String d = C96926b0.m124490b().mo135519d(w0Var.f287274b.f166996a);
                C87412m.m108593f(d, "getInstance().getText(smileyItem.smileyInfo.key)");
                C99145a.f290700a = w0Var.f287275c;
                C76595c a2 = C76595c.m92188a();
                String n2 = C112551y.m153814n(d, ",", " ", false);
                boolean z = w0Var.f287275c;
                int i5 = w0Var.f287276d;
                a2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                C115669n.INSTANCE.mo160131h(13470, n2, Integer.valueOf(a2.f224190c), Integer.valueOf(z ? 1 : 0), 0, 0, Integer.valueOf(i5), Integer.valueOf(a2.f224192e ? 1 : 0), Integer.valueOf(a2.f224191d), Integer.valueOf(a2.f224189b), Long.valueOf(currentTimeMillis2 - a2.f224188a), Long.valueOf(currentTimeMillis2), Long.valueOf(a2.f224188a), Integer.valueOf(a2.f224193f));
                a2.f224189b++;
                ChatFooterPanel.C72719a aVar2 = this.f289455c;
                if (aVar2 != null) {
                    aVar2.mo64627b(d);
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int i6 = ((C97938w) q0Var2).f287273b;
                    if (i6 == 0) {
                        C115669n.INSTANCE.mo160131h(11594, 1);
                        C88144b.m109791i(activity, "emoji", ".ui.EmojiCustomUI", new Intent(), (Bundle) null);
                    } else if (i6 == 1 && ((C39315g) C86312j.m106911c(cls2)).getProvider().mo138020g()) {
                        int i7 = this.f289453a;
                        int i8 = ChatFooterPanel.f211589f;
                        if (i7 != 1) {
                            if (i7 == 12) {
                                i2 = 3;
                            } else if (i7 == 7) {
                                i2 = 4;
                            } else if (i7 == 8) {
                                i2 = 5;
                            }
                            C37682c.m41480c(context, (String) null, 1111, i2, (String) null, this.f289456d);
                        }
                        i2 = 2;
                        C37682c.m41480c(context, (String) null, 1111, i2, (String) null, this.f289456d);
                    }
                } else if (i4 == 6) {
                    IEmojiInfo iEmojiInfo3 = ((C97904g) q0Var2).f287200b;
                    Log.m105925i("MicroMsg.EmojiPanelClickListener", "penn send capture emoji click emoji: %s status: %d.", iEmojiInfo3.getMd5(), Integer.valueOf(iEmojiInfo3.mo62641L()));
                    IEmojiInfo.C40005a T1 = iEmojiInfo3.mo62647T1();
                    int i9 = T1 == null ? -1 : C98712a.f289458a[T1.ordinal()];
                    if (i9 == 1) {
                        C72837v1 v1Var2 = this.f289454b;
                        if (v1Var2 != null) {
                            v1Var2.mo65586X1(iEmojiInfo3);
                        }
                        Log.m105919d("MicroMsg.EmojiPanelClickListener", "onSendCustomEmoji emoji md5 is [%s].", iEmojiInfo3.getMd5());
                    } else if (i9 == 2 || i9 == 3) {
                        C76879j.m92726T(activity, activity.getString(C0966R.string.f360362c50));
                    } else if (i9 == 4) {
                        C77426q qVar = new C77426q(activity);
                        qVar.mo107595g(activity.getString(C0966R.string.c4v));
                        qVar.mo107601m(C0966R.string.f360377ca1);
                        qVar.mo107599k(context.getResources().getColor(C0966R.color.a_3));
                        qVar.mo107590b(new C76360e(iEmojiInfo3));
                        qVar.mo107603o();
                    } else if (i9 == 5) {
                        IEmojiInfo.C40006b X1 = iEmojiInfo3.mo62651X1();
                        Log.m105919d("MicroMsg.EmojiPanelClickListener", "CaptureUploadErrCode: %d.", Integer.valueOf(X1.ordinal()));
                        switch (X1.ordinal()) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                C77426q qVar2 = new C77426q(activity);
                                qVar2.mo107595g(activity.getString(C0966R.string.c4z));
                                qVar2.mo107601m(C0966R.string.c4x);
                                qVar2.mo107590b(new C98717f(this, activity, iEmojiInfo3));
                                qVar2.mo107603o();
                                return;
                            case 5:
                                C97491p pVar = C97491p.f286143a;
                                pVar.mo136773a(false);
                                if (pVar.mo136774c().getBoolean("capture_full", false)) {
                                    C77426q qVar3 = new C77426q(activity);
                                    qVar3.mo107595g(activity.getString(C0966R.string.f360376ca0));
                                    qVar3.mo107602n(activity.getString(C0966R.string.c8w));
                                    qVar3.mo107590b(new C8927g(activity));
                                    qVar3.mo107603o();
                                    return;
                                }
                                C77426q qVar4 = new C77426q(activity);
                                qVar4.mo107595g(activity.getString(C0966R.string.c4z));
                                qVar4.mo107601m(C0966R.string.c4x);
                                qVar4.mo107590b(new C98719h(this, activity, iEmojiInfo3));
                                qVar4.mo107603o();
                                return;
                            case 6:
                                C77426q qVar5 = new C77426q(activity);
                                qVar5.mo107595g(activity.getString(C0966R.string.c4z));
                                qVar5.mo107601m(C0966R.string.c4x);
                                qVar5.mo107590b(new C98723i(this, activity, iEmojiInfo3));
                                qVar5.mo107603o();
                                return;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                if (IEmojiInfo.C40006b.ERR_LOCAL_FILE == iEmojiInfo3.mo62651X1()) {
                                    str = activity.getString(C0966R.string.c4v);
                                    C87412m.m108593f(str, "context.getString(R.stri…ailure_upload_local_file)");
                                } else if (IEmojiInfo.C40006b.ERR_OVER_SIZE == iEmojiInfo3.mo62651X1()) {
                                    str = activity.getString(C0966R.string.c5m);
                                    C87412m.m108593f(str, "context.getString(R.stri…ustom_gif_max_size_limit)");
                                } else if (IEmojiInfo.C40006b.ERR_SPAM == iEmojiInfo3.mo62651X1()) {
                                    str = activity.getString(C0966R.string.c4y);
                                    C87412m.m108593f(str, "context.getString(R.stri…ture_failure_upload_spam)");
                                } else {
                                    str = activity.getString(C0966R.string.c4w);
                                    C87412m.m108593f(str, "context.getString(R.stri…ad_over_upload_max_count)");
                                }
                                C77426q qVar6 = new C77426q(activity);
                                qVar6.mo107595g(str);
                                qVar6.mo107601m(C0966R.string.f360377ca1);
                                qVar6.mo107599k(context.getResources().getColor(C0966R.color.a_3));
                                qVar6.mo107590b(new C76361j(iEmojiInfo3));
                                qVar6.mo107603o();
                                return;
                            default:
                                C77426q qVar7 = new C77426q(activity);
                                qVar7.mo107595g(activity.getString(C0966R.string.c4z));
                                qVar7.mo107601m(C0966R.string.c4x);
                                qVar7.mo107590b(new C98726k(this, activity, iEmojiInfo3));
                                qVar7.mo107603o();
                                return;
                        }
                    }
                } else if (i4 != 7) {
                    if (i4 == 10 && (aVar = this.f289457e) != null) {
                        aVar.invoke();
                    }
                } else if (((C39315g) C86312j.m106911c(cls2)).getProvider().mo138020g()) {
                    int i15 = this.f289453a;
                    int i16 = ChatFooterPanel.f211589f;
                    if (i15 != 1) {
                        if (i15 == 12) {
                            i3 = 3;
                        } else if (i15 == 7) {
                            i3 = 4;
                        } else if (i15 == 8) {
                            i3 = 5;
                        }
                        C37682c.m41480c(context, (String) null, 1111, i3, (String) null, this.f289456d);
                    }
                    i3 = 2;
                    C37682c.m41480c(context, (String) null, 1111, i3, (String) null, this.f289456d);
                }
            } else if (((C37873b) C86312j.m106911c(cls)).mo61224e()) {
                ((C37873b) C86312j.m106911c(cls)).mo61225m4(activity);
            } else {
                C99146d.f290701a.mo138515a(2);
                C49978jd3 jd32 = ((C97903f0) q0Var2).f287198c;
                if (jd32 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("uin", jd32.f136019d);
                    intent.putExtra("name", jd32.f136020e);
                    intent.putExtra("headurl", jd32.f136021f);
                    Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
                    if ((castActivityOrNull == null || (localClassName = castActivityOrNull.getLocalClassName()) == null || !C112550d0.m153801u(localClassName, "AppBrandUI", false)) ? false : true) {
                        intent.putExtra("from_appbrand_ui", true);
                    }
                    if (castActivityOrNull != null) {
                        activity = castActivityOrNull;
                    }
                    C88144b.m109791i(activity, "emoji", ".ui.v2.EmojiStoreV2DesignerUI", intent, (Bundle) null);
                }
            }
        }
    }
}
