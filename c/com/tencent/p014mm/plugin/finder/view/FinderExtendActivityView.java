package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dp1.C58408t0;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import je1.C9312g4;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49277ef1;
import te3.C49295ek0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AB#\b\u0016\u0012\u0006\u0010=\u001a\u00020<\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b@\u0010DJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128F@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006E"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExtendActivityView;", "Landroid/widget/FrameLayout;", "Lob0/n;", "", "isEnable", "Lrx3/b0;", "setEnable", "Landroid/content/Intent;", "intent", "setIntentParam", "", "h", "Ljava/lang/String;", "getVstId", "()Ljava/lang/String;", "setVstId", "(Ljava/lang/String;)V", "vstId", "Lte3/ef1;", "i", "Lte3/ef1;", "getActivityEvent", "()Lte3/ef1;", "setActivityEvent", "(Lte3/ef1;)V", "activityEvent", "Lfe1/q;", "j", "Lfe1/q;", "getContact", "()Lfe1/q;", "setContact", "(Lfe1/q;)V", "contact", "Lte3/ek0;", "u", "Lte3/ek0;", "getActivityWordingInfo", "()Lte3/ek0;", "setActivityWordingInfo", "(Lte3/ek0;)V", "activityWordingInfo", "", "v", "J", "getActivityTopicId", "()J", "setActivityTopicId", "(J)V", "activityTopicId", "w", "getDisplayMask", "setDisplayMask", "displayMask", "Landroid/view/View$OnClickListener;", "B", "Landroid/view/View$OnClickListener;", "getOnClickListener", "()Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendActivityView */
public final class FinderExtendActivityView extends FrameLayout implements C11385n {

    /* renamed from: A */
    public String f17664A = "";

    /* renamed from: B */
    public final View.OnClickListener f17665B;

    /* renamed from: d */
    public TextView f17666d;

    /* renamed from: e */
    public TextView f17667e;

    /* renamed from: f */
    public WeImageView f17668f;

    /* renamed from: g */
    public C4191v0 f17669g;

    /* renamed from: h */
    public String f17670h = "";

    /* renamed from: i */
    public C49277ef1 f17671i = new C49277ef1();

    /* renamed from: j */
    public C58969q f17672j;

    /* renamed from: n */
    public int f17673n = 100;

    /* renamed from: o */
    public String f17674o = "";

    /* renamed from: p */
    public String f17675p = "";

    /* renamed from: q */
    public String f17676q = "";

    /* renamed from: r */
    public String f17677r = "";

    /* renamed from: s */
    public String f17678s = "";

    /* renamed from: t */
    public String f17679t = "";

    /* renamed from: u */
    public C49295ek0 f17680u;

    /* renamed from: v */
    public long f17681v;

    /* renamed from: w */
    public long f17682w;

    /* renamed from: x */
    public long f17683x;

    /* renamed from: y */
    public String f17684y = "";

    /* renamed from: z */
    public boolean f17685z = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderExtendActivityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C4177t1 t1Var = new C4177t1(this);
        this.f17665B = t1Var;
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.anc, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.hzq);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.post_activity_item_title)");
        this.f17666d = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hzp);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.post_activity_item_desc)");
        this.f17667e = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.d0d);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.f…ost_activity_item_layout)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f5482gc);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.activity_flag_icon)");
        this.f17668f = (WeImageView) findViewById4;
        setOnClickListener(t1Var);
    }

    private final void setEnable(boolean z) {
        this.f17685z = z;
        setAlpha(1.0f);
        setOnClickListener(this.f17665B);
        this.f17667e.setTextColor(getContext().getResources().getColor(C0966R.color.FG_2));
        if (z) {
            this.f17667e.setText(C0966R.string.cyd);
        } else {
            this.f17667e.setText(C0966R.string.cyg);
        }
    }

    /* renamed from: a */
    public final void mo4463a(Intent intent, int i) {
        Intent intent2 = intent;
        int i2 = i;
        C87412m.m108594g(intent2, "intent");
        int i3 = 1;
        if ((intent2.hasExtra("key_topic_id") && (i2 == 101 || i2 == 102)) || i2 == 100) {
            this.f17673n = i2;
            this.f17684y = intent2.getStringExtra("key_nick_name");
            this.f17676q = intent2.getStringExtra("key_activity_name");
            this.f17679t = intent2.getStringExtra("key_activity_desc");
            this.f17682w = intent2.getLongExtra("key_activity_display_mask", 0);
            this.f17677r = intent2.getStringExtra("key_nick_name");
            byte[] byteArrayExtra = intent2.getByteArrayExtra("key_wording_info");
            if (byteArrayExtra != null) {
                C49295ek0 ek02 = new C49295ek0();
                try {
                    ek02.parseFrom(byteArrayExtra);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                    ek02 = null;
                }
                this.f17680u = ek02;
            }
            this.f17678s = intent2.getStringExtra("key_avatar_url");
            this.f17681v = intent2.getLongExtra("key_topic_id", 0);
            this.f17683x = intent2.getLongExtra("key_activity_end_time", 0);
            String stringExtra = intent2.getStringExtra("key_activity_src_type");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f17664A = stringExtra;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            String E = C58784w3.f168295a.mo83865E(this.f17683x * 1000, context, C0966R.string.n16);
            if (this.f17683x != 0) {
                mo4464b(this.f17676q, E, this.f17684y, i2);
            } else {
                mo4464b(this.f17676q, (String) null, this.f17684y, i2);
            }
            if (i2 != 100) {
                if (i2 != 102) {
                    i3 = 2;
                }
                String p = C61926c.m72691p(this.f17681v);
                FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.topicActivityId = p;
                    finderFeedReportObject.topicActivityType = i3;
                }
            }
            if (i2 == 101) {
                this.f17674o = intent2.getStringExtra("key_activity_local_cover_url");
                this.f17675p = intent2.getStringExtra("key_cover_url");
            } else if (i2 != 102) {
                this.f17674o = "";
                this.f17675p = "";
            } else {
                this.f17675p = intent2.getStringExtra("key_cover_url");
            }
        }
        C58969q qVar = this.f17672j;
        if (qVar != null && this.f17673n == 100) {
            C86709a0.m107524d().mo123455a(4050, this);
            C86709a0.m107524d().mo123460f(new C9312g4(qVar.getUsername(), (String) null, (String) null, (String) null, 0, 1, 30, (C8480h) null));
        }
    }

    /* renamed from: b */
    public final void mo4464b(String str, String str2, String str3, int i) {
        boolean z = true;
        if (str2 != null) {
            if (this.f17683x != Util.MAX_32BIT_VALUE) {
                C58784w3 w3Var = C58784w3.f168295a;
                long j = this.f17682w;
                w3Var.getClass();
                if ((j & 2) == 2) {
                    z = false;
                }
                if (z) {
                    this.f17667e.setVisibility(0);
                    this.f17667e.setText(str2);
                }
            }
            this.f17667e.setVisibility(8);
        } else {
            if (!(str == null || str.length() == 0)) {
                if (!(str3 == null || str3.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    this.f17667e.setVisibility(8);
                }
            }
            this.f17667e.setVisibility(0);
            this.f17667e.setText(C0966R.string.cyd);
        }
        TextView textView = this.f17666d;
        if (i == 101 || i == 102) {
            if (C58784w3.f168295a.mo83908W0(this.f17682w)) {
                str = str3 + ": " + str;
            }
            textView.setText(str);
        } else {
            textView.setText(textView.getResources().getText(C0966R.string.czr));
        }
        WeImageView weImageView = this.f17668f;
        if (i == 101 || i == 102) {
            weImageView.setIconColor(weImageView.getResources().getColor(C0966R.color.f2939n));
            weImageView.setImageResource(C0966R.raw.finder_filled_activity);
            return;
        }
        weImageView.setIconColor(weImageView.getResources().getColor(C0966R.color.FG_0));
        weImageView.setImageResource(C0966R.raw.finder_outlined_activity);
    }

    public final C49277ef1 getActivityEvent() {
        C49277ef1 ef12 = this.f17671i;
        ef12.f132898d = this.f17681v;
        String str = this.f17676q;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        ef12.f132899e = str;
        String str3 = this.f17677r;
        if (str3 != null) {
            str2 = str3;
        }
        ef12.f132900f = str2;
        ef12.f132902h = this.f17680u;
        Log.m105924i("Finder.ExtendActivityView", "get activityEvent " + this.f17671i.f132899e + " eventTopicId:" + this.f17671i.f132898d);
        return this.f17671i;
    }

    public final long getActivityTopicId() {
        return this.f17681v;
    }

    public final C49295ek0 getActivityWordingInfo() {
        return this.f17680u;
    }

    public final C58969q getContact() {
        return this.f17672j;
    }

    public final long getDisplayMask() {
        return this.f17682w;
    }

    public final View.OnClickListener getOnClickListener() {
        return this.f17665B;
    }

    public final String getVstId() {
        return this.f17670h;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C9312g4) {
            C86709a0.m107524d().mo123470p(4050, this);
            if (i == 0 && i2 == 0) {
                setEnable(true);
            } else if (i2 == -4064) {
                setEnable(false);
            }
        }
    }

    public final void setActivityEvent(C49277ef1 ef12) {
        C87412m.m108594g(ef12, "<set-?>");
        this.f17671i = ef12;
    }

    public final void setActivityTopicId(long j) {
        this.f17681v = j;
    }

    public final void setActivityWordingInfo(C49295ek0 ek02) {
        this.f17680u = ek02;
    }

    public final void setContact(C58969q qVar) {
        this.f17672j = qVar;
    }

    public final void setDisplayMask(long j) {
        this.f17682w = j;
    }

    public final void setIntentParam(Intent intent) {
        String str;
        String str2;
        byte[] byteArray;
        if (intent != null) {
            C58969q qVar = this.f17672j;
            String str3 = qVar != null ? qVar.field_username : null;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            intent.putExtra("key_user_name", str3);
            if (Util.isNullOrNil(this.f17677r)) {
                C58969q qVar2 = this.f17672j;
                str = qVar2 != null ? qVar2.getNickname() : str4;
            } else {
                str = this.f17677r;
            }
            intent.putExtra("key_nick_name", str);
            if (Util.isNullOrNil(this.f17678s)) {
                C58969q qVar3 = this.f17672j;
                str2 = qVar3 != null ? qVar3.getAvatarUrl() : str4;
            } else {
                str2 = this.f17678s;
            }
            intent.putExtra("key_avatar_url", str2);
            intent.putExtra("key_topic_id", this.f17681v);
            String str5 = this.f17676q;
            if (str5 == null) {
                str5 = str4;
            }
            intent.putExtra("key_activity_name", str5);
            String str6 = this.f17679t;
            if (str6 == null) {
                str6 = str4;
            }
            intent.putExtra("key_activity_desc", str6);
            intent.putExtra("key_activity_display_mask", this.f17682w);
            intent.putExtra("key_activity_end_time", this.f17683x);
            intent.putExtra("key_activity_src_type", this.f17664A);
            C49295ek0 ek02 = this.f17680u;
            if (!(ek02 == null || (byteArray = ek02.toByteArray()) == null)) {
                intent.putExtra("key_wording_info", byteArray);
            }
            int i = this.f17673n;
            if (i == 101) {
                String str7 = this.f17674o;
                if (str7 == null) {
                    str7 = str4;
                }
                intent.putExtra("key_activity_local_cover_url", str7);
                String str8 = this.f17675p;
                if (str8 != null) {
                    str4 = str8;
                }
                intent.putExtra("key_cover_url", str4);
            } else if (i == 102) {
                String str9 = this.f17675p;
                if (str9 != null) {
                    str4 = str9;
                }
                intent.putExtra("key_cover_url", str4);
                intent.putExtra("key_is_from_post", true);
            }
            intent.putExtra("key_activity_type", this.f17673n);
            intent.putExtra("vst_id", this.f17670h);
        }
    }

    public final void setVstId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f17670h = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderExtendActivityView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C4177t1 t1Var = new C4177t1(this);
        this.f17665B = t1Var;
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.anc, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.hzq);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.post_activity_item_title)");
        this.f17666d = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hzp);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.post_activity_item_desc)");
        this.f17667e = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.d0d);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.f…ost_activity_item_layout)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f5482gc);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.activity_flag_icon)");
        this.f17668f = (WeImageView) findViewById4;
        setOnClickListener(t1Var);
    }
}
