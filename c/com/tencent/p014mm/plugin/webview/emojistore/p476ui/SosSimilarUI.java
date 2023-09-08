package com.tencent.p014mm.plugin.webview.emojistore.p476ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C39883l;
import c00.C39885s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.xweb.file.XVFSFile;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import kj2.C117407d;
import kotlin.Metadata;
import nj3.C76912y0;
import o83.C100296a;
import o83.C100297b;
import o83.C100299d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p008bq.C0363p0;
import p008bq.C0365s0;
import p008bq.C28385n1;
import p008bq.C92286m1;
import p008bq.C92290u0;
import p171il.C98744t;
import p171il.C98746w;
import p640ox.C77049b;
import p813fl.C97904g;
import p813fl.C97927q0;
import sx3.C64197v;
import te3.C51593us3;
import te3.l54;
import u73.C22613h1;
import uo3.C78253a;
import wc3.C78541w;
import wd3.C65953v0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/emojistore/ui/SosSimilarUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lob0/n;", "Lbq/m1$a;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI */
public final class SosSimilarUI extends MMSecDataActivity implements C11385n, C92286m1.C92287a {

    /* renamed from: d */
    public final C100299d f282910d = new C100299d();

    /* renamed from: e */
    public final C98746w f282911e = ((C92290u0) C86312j.m106911c(C92290u0.class)).mo126052lo();

    /* renamed from: f */
    public RecyclerView f282912f;

    /* renamed from: g */
    public int f282913g;

    /* renamed from: h */
    public long f282914h;

    /* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI$a */
    public static final class C96624a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SosSimilarUI f282915d;

        public C96624a(SosSimilarUI sosSimilarUI) {
            this.f282915d = sosSimilarUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f282915d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI$b */
    public static final class C96625b extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ SosSimilarUI f282916b;

        /* renamed from: c */
        public final /* synthetic */ GridLayoutManager f282917c;

        public C96625b(SosSimilarUI sosSimilarUI, GridLayoutManager gridLayoutManager) {
            this.f282916b = sosSimilarUI;
            this.f282917c = gridLayoutManager;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            int itemViewType = this.f282916b.f282911e.getItemViewType(i);
            if (itemViewType != 100) {
                switch (itemViewType) {
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                        break;
                    default:
                        return 1;
                }
            }
            return this.f282917c.f44669w;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI$c */
    public static final class C96626c implements C98744t {

        /* renamed from: a */
        public final /* synthetic */ SosSimilarUI f282918a;

        /* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI$c$a */
        public static final class C96627a implements C65953v0 {

            /* renamed from: a */
            public final /* synthetic */ C8479f0<IEmojiInfo> f282919a;

            /* renamed from: b */
            public final /* synthetic */ Context f282920b;

            /* renamed from: c */
            public final /* synthetic */ SosSimilarUI f282921c;

            public C96627a(C8479f0<IEmojiInfo> f0Var, Context context, SosSimilarUI sosSimilarUI) {
                this.f282919a = f0Var;
                this.f282920b = context;
                this.f282921c = sosSimilarUI;
            }

            /* renamed from: a */
            public final void mo23a(boolean z, String str, int i) {
                if (z) {
                    ((C92290u0) C86312j.m106911c(C92290u0.class)).mo126050X1((IEmojiInfo) this.f282919a.f27484d);
                    Context context = this.f282920b;
                    C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.a2x), 1).show();
                }
                this.f282921c.mo134733I7((IEmojiInfo) this.f282919a.f27484d, z);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI$c$b */
        public static final class C96628b implements C65953v0 {

            /* renamed from: a */
            public final /* synthetic */ SosSimilarUI f282922a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<IEmojiInfo> f282923b;

            public C96628b(SosSimilarUI sosSimilarUI, C8479f0<IEmojiInfo> f0Var) {
                this.f282922a = sosSimilarUI;
                this.f282923b = f0Var;
            }

            /* renamed from: a */
            public final void mo23a(boolean z, String str, int i) {
                if (z) {
                    C0365s0 s0Var = (C0365s0) C86312j.m106911c(C0365s0.class);
                    SimilarEmojiQueryModel similarEmojiQueryModel = this.f282922a.f282910d.f293817e;
                    s0Var.O60(similarEmojiQueryModel != null ? similarEmojiQueryModel.f283915i : null, (IEmojiInfo) this.f282923b.f27484d, (C72963f4) null);
                    Intent intent = new Intent();
                    intent.putExtra("KEY_EMOJI_INFO_RESULT", (Parcelable) this.f282923b.f27484d);
                    this.f282922a.setResult(-1, intent);
                    this.f282922a.finish();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI$c$c */
        public static final class C96629c implements C65953v0 {

            /* renamed from: a */
            public final /* synthetic */ SosSimilarUI f282924a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<IEmojiInfo> f282925b;

            /* renamed from: c */
            public final /* synthetic */ Context f282926c;

            public C96629c(SosSimilarUI sosSimilarUI, C8479f0<IEmojiInfo> f0Var, Context context) {
                this.f282924a = sosSimilarUI;
                this.f282925b = f0Var;
                this.f282926c = context;
            }

            /* renamed from: a */
            public final void mo23a(boolean z, String str, int i) {
                if (z) {
                    C0365s0 s0Var = (C0365s0) C86312j.m106911c(C0365s0.class);
                    SimilarEmojiQueryModel similarEmojiQueryModel = this.f282924a.f282910d.f293817e;
                    String str2 = null;
                    s0Var.O60(similarEmojiQueryModel != null ? similarEmojiQueryModel.f283915i : null, (IEmojiInfo) this.f282925b.f27484d, (C72963f4) null);
                    if (!Util.isNullOrNil(str)) {
                        C97425j a = C7250m.m7431a();
                        SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f282924a.f282910d.f293817e;
                        if (similarEmojiQueryModel2 != null) {
                            str2 = similarEmojiQueryModel2.f283915i;
                        }
                        a.mo136252Ar(str, str2);
                    }
                    Context context = this.f282926c;
                    C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.a2x), 1).show();
                }
                this.f282924a.mo134733I7((IEmojiInfo) this.f282925b.f27484d, z);
            }
        }

        public C96626c(SosSimilarUI sosSimilarUI) {
            this.f282918a = sosSimilarUI;
        }

        /* renamed from: b */
        public void mo127710b(View view, Context context, int i, C97927q0 q0Var) {
            String str;
            int i2 = i;
            C87412m.m108594g(context, "context");
            C97927q0 item = this.f282918a.f282911e.getItem(i2);
            if (item instanceof C97904g) {
                C97904g gVar = (C97904g) item;
                IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo403r2(gVar.f287200b.getMd5());
                boolean z = false;
                if ((r2 != null ? r2.getGroup() : 0) == 81) {
                    z = true;
                }
                SimilarEmoticonSearchLongpressStruct similarEmoticonSearchLongpressStruct = new SimilarEmoticonSearchLongpressStruct();
                similarEmoticonSearchLongpressStruct.f265915f = (long) (this.f282918a.f282910d.mo139555c() ? 59 : 78);
                similarEmoticonSearchLongpressStruct.f265913d = similarEmoticonSearchLongpressStruct.mo86045b("SessionId", this.f282918a.f282910d.f293820h, true);
                similarEmoticonSearchLongpressStruct.f265914e = similarEmoticonSearchLongpressStruct.mo86045b("SearchId", this.f282918a.f282910d.f293821i, true);
                similarEmoticonSearchLongpressStruct.f265916g = similarEmoticonSearchLongpressStruct.mo86045b("ClickMD5", gVar.f287200b.getMd5(), true);
                SimilarEmojiQueryModel similarEmojiQueryModel = this.f282918a.f282910d.f293817e;
                if (similarEmojiQueryModel == null || (str = similarEmojiQueryModel.f283911e) == null) {
                    str = "";
                }
                similarEmoticonSearchLongpressStruct.f265917h = similarEmoticonSearchLongpressStruct.mo86045b("QueryMD5", str, true);
                similarEmoticonSearchLongpressStruct.f265918i = (long) this.f282918a.f282910d.f293818f;
                similarEmoticonSearchLongpressStruct.f265919j = (long) i2;
                similarEmoticonSearchLongpressStruct.f265920k = System.currentTimeMillis();
                similarEmoticonSearchLongpressStruct.f265921l = similarEmoticonSearchLongpressStruct.mo86045b("RequestId", this.f282918a.f282910d.f293821i, true);
                long j = 1;
                similarEmoticonSearchLongpressStruct.f265922m = 1;
                if (!z) {
                    j = 0;
                }
                similarEmoticonSearchLongpressStruct.f265923n = j;
                similarEmoticonSearchLongpressStruct.mo86054n();
                C22613h1.m26490p(similarEmoticonSearchLongpressStruct);
                if (!z) {
                    C78253a aVar = new C78253a(this.f282918a);
                    C100296a aVar2 = new C100296a(gVar);
                    SosSimilarUI sosSimilarUI = this.f282918a;
                    aVar.mo108272g(view, 0, 0, aVar2, new C100297b(sosSimilarUI, gVar, sosSimilarUI.f282910d, i2), TouchableLayout.f24959d, TouchableLayout.f24960e);
                }
            }
        }

        /* renamed from: c */
        public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
            String str;
            Class cls = C78541w.class;
            C87412m.m108594g(context, "context");
            if (q0Var != null && (q0Var instanceof C97904g)) {
                C97904g gVar = (C97904g) q0Var;
                if (gVar.f287201c == 103) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SosSimilarUI sosSimilarUI = this.f282918a;
                    if (currentTimeMillis - sosSimilarUI.f282914h >= 500) {
                        sosSimilarUI.f282914h = System.currentTimeMillis();
                        ((C92290u0) C86312j.m106911c(C92290u0.class)).O90(view, context, i, q0Var);
                        C8479f0 f0Var = new C8479f0();
                        f0Var.f27484d = gVar.f287200b;
                        String str2 = null;
                        if (this.f282918a.f282910d.mo139555c()) {
                            C78541w wVar = (C78541w) C86312j.m106911c(cls);
                            SimilarEmojiQueryModel similarEmojiQueryModel = this.f282918a.f282910d.f293817e;
                            wVar.mo108493Xn(context, similarEmojiQueryModel != null ? similarEmojiQueryModel.f283915i : null, ((IEmojiInfo) f0Var.f27484d).getMd5(), ((IEmojiInfo) f0Var.f27484d).mo62680l(), new C96627a(f0Var, context, this.f282918a));
                        } else if (this.f282918a.getIntent().getBooleanExtra("KEY_GET_EMOJI_INFO_DIRECTLY", false)) {
                            C78541w wVar2 = (C78541w) C86312j.m106911c(cls);
                            SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f282918a.f282910d.f293817e;
                            wVar2.cu0(context, similarEmojiQueryModel2 != null ? similarEmojiQueryModel2.f283915i : null, ((IEmojiInfo) f0Var.f27484d).getMd5(), ((IEmojiInfo) f0Var.f27484d).mo62685o0(), "", ((IEmojiInfo) f0Var.f27484d).getThumbUrl(), new C96628b(this.f282918a, f0Var));
                        } else {
                            C78541w wVar3 = (C78541w) C86312j.m106911c(cls);
                            SimilarEmojiQueryModel similarEmojiQueryModel3 = this.f282918a.f282910d.f293817e;
                            wVar3.Op0(context, similarEmojiQueryModel3 != null ? similarEmojiQueryModel3.f283915i : null, ((IEmojiInfo) f0Var.f27484d).getMd5(), ((IEmojiInfo) f0Var.f27484d).mo62685o0(), "", ((IEmojiInfo) f0Var.f27484d).getThumbUrl(), new C96629c(this.f282918a, f0Var, context));
                        }
                        C51593us3 us32 = new C51593us3();
                        if (this.f282918a.f282910d.mo139555c()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("logid=17372&sessionid=");
                            sb.append(this.f282918a.f282910d.f293821i);
                            sb.append("&searchid=");
                            sb.append(this.f282918a.f282910d.f293821i);
                            sb.append("&scene=59&clickmd5=");
                            sb.append(((IEmojiInfo) f0Var.f27484d).getMd5());
                            sb.append("&querymd5=");
                            SimilarEmojiQueryModel similarEmojiQueryModel4 = this.f282918a.f282910d.f293817e;
                            if (similarEmojiQueryModel4 != null) {
                                str2 = similarEmojiQueryModel4.f283911e;
                            }
                            sb.append(str2);
                            sb.append("&offset=");
                            sb.append(this.f282918a.f282910d.f293818f);
                            sb.append("&pos=");
                            sb.append(i);
                            sb.append("&clienttimestamp=");
                            sb.append(System.currentTimeMillis());
                            sb.append("&tab=0&requestid=");
                            sb.append(this.f282918a.f282910d.f293821i);
                            us32.f143104t = sb.toString();
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("scene=78&searchid=");
                            sb4.append(this.f282918a.f282910d.f293821i);
                            sb4.append("&businesstype=256&docid=");
                            sb4.append(gVar.f287202d);
                            sb4.append("&docpos=");
                            sb4.append(i);
                            sb4.append("&typepos=0&ishomepage=0&clienttimestamp=");
                            sb4.append(C31543z5.m39453c());
                            sb4.append("&sceneactiontype=1&query=");
                            SimilarEmojiQueryModel similarEmojiQueryModel5 = this.f282918a.f282910d.f293817e;
                            if (similarEmojiQueryModel5 == null || (str = similarEmojiQueryModel5.f283910d) == null) {
                                str = "";
                            }
                            sb4.append(str);
                            sb4.append("&sessionid=");
                            sb4.append(this.f282918a.f282910d.f293820h);
                            sb4.append("&nettype=");
                            sb4.append(C43471q.m46979c());
                            sb4.append("&requestid=");
                            sb4.append(this.f282918a.f282910d.f293821i);
                            sb4.append("&reqbusinesstype=256&pageno=");
                            sb4.append(gVar.f287203e);
                            us32.f143104t = sb4.toString();
                        }
                        C39883l Hr = ((C39885s) C86312j.m106911c(C39885s.class)).mo62256Hr(us32);
                        C89137b0 d = C86709a0.m107524d();
                        C87412m.m108592e(Hr, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
                        d.mo123460f((C117747y) Hr);
                        Log.m105924i("MicroMsg.WebSearch.SosSimilarUI", us32.f143104t);
                    }
                }
            }
        }
    }

    /* renamed from: H7 */
    public final int mo134732H7() {
        int g = C85875k4.m106182g();
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        int i = (g - (((int) ((108.0f * context.getResources().getDisplayMetrics().density) + 0.5f)) * 3)) / 8;
        Log.m105924i("MicroMsg.WebSearch.SosSimilarUI", "recycler view padding :" + i);
        if (i > 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: I7 */
    public final void mo134733I7(IEmojiInfo iEmojiInfo, boolean z) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        int i = z ? 1 : 2;
        C117407d dVar = C117407d.INSTANCE;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.f282910d.mo139555c() ? 59 : 78);
        String str = this.f282910d.f293821i;
        objArr[1] = str;
        objArr[2] = str;
        objArr[3] = str;
        objArr[4] = Integer.valueOf(i);
        objArr[5] = iEmojiInfo.getMd5();
        dVar.mo160131h(18742, objArr);
    }

    /* renamed from: J7 */
    public final void mo134734J7() {
        String str;
        if (this.f282913g < this.f282911e.mo125851e0()) {
            C51593us3 us32 = new C51593us3();
            int i = 0;
            String str2 = null;
            String str3 = "";
            if (this.f282910d.mo139555c()) {
                for (T next : this.f282910d.f293823n) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C97904g gVar = (C97904g) next;
                        if (i > this.f282913g && i <= this.f282911e.mo125851e0() - 2) {
                            str3 = str3 + gVar.f287200b.getMd5() + ';';
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("logid=17368&sessionid=");
                sb.append(this.f282910d.f293821i);
                sb.append("&searchid=");
                sb.append(this.f282910d.f293821i);
                sb.append("&scene=59&md5=");
                SimilarEmojiQueryModel similarEmojiQueryModel = this.f282910d.f293817e;
                if (similarEmojiQueryModel != null) {
                    str2 = similarEmojiQueryModel.f283911e;
                }
                sb.append(str2);
                sb.append("&md5content=");
                sb.append(str3);
                sb.append("&pos=");
                sb.append(this.f282913g + 2);
                sb.append("&clienttimestamp=");
                sb.append(System.currentTimeMillis());
                sb.append("&tab=0&requestid=");
                sb.append(this.f282910d.f293821i);
                us32.f143104t = sb.toString();
            } else {
                String str4 = str3;
                for (T next2 : this.f282910d.f293823n) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        C97904g gVar2 = (C97904g) next2;
                        if (i > this.f282913g && i <= this.f282911e.mo125851e0() - 2) {
                            str4 = str4 + "256:" + gVar2.f287202d + XVFSFile.PATH_SEPARATOR_CHAR + C31543z5.m39453c() + ';';
                        }
                        i = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("isexpose=1&searchid=");
                sb4.append(this.f282910d.f293821i);
                sb4.append("&content=");
                sb4.append(str4);
                sb4.append("&query=");
                SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f282910d.f293817e;
                if (!(similarEmojiQueryModel2 == null || (str = similarEmojiQueryModel2.f283910d) == null)) {
                    str3 = str;
                }
                sb4.append(str3);
                sb4.append("&ishomepage=0&&sessionid=");
                sb4.append(this.f282910d.f293820h);
                sb4.append("&scene=78&logtype=1&requestid=");
                sb4.append(this.f282910d.f293821i);
                sb4.append("&pageno=");
                sb4.append(this.f282910d.f293819g);
                us32.f143104t = sb4.toString();
            }
            C39883l Hr = ((C39885s) C86312j.m106911c(C39885s.class)).mo62256Hr(us32);
            C89137b0 d = C86709a0.m107524d();
            C87412m.m108592e(Hr, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123460f((C117747y) Hr);
            this.f282913g = this.f282911e.mo125851e0();
            Log.m105924i("MicroMsg.WebSearch.SosSimilarUI", us32.f143104t);
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126274X1(p008bq.C92286m1 r3, androidx.recyclerview.widget.RecyclerView.C16613e<?> r4) {
        /*
            r2 = this;
            o83.d r3 = r2.f282910d
            boolean r3 = r3.f293822j
            if (r3 == 0) goto L_0x0034
            androidx.recyclerview.widget.RecyclerView r3 = r2.f282912f
            boolean r4 = r3 instanceof p008bq.C92286m1
            r0 = 0
            if (r4 == 0) goto L_0x0010
            bq.m1 r3 = (p008bq.C92286m1) r3
            goto L_0x0011
        L_0x0010:
            r3 = r0
        L_0x0011:
            r4 = 1
            r1 = 0
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.mo126273z()
            if (r3 != 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            if (r1 == 0) goto L_0x0034
            androidx.recyclerview.widget.RecyclerView r3 = r2.f282912f
            boolean r1 = r3 instanceof p008bq.C92286m1
            if (r1 == 0) goto L_0x0027
            r0 = r3
            bq.m1 r0 = (p008bq.C92286m1) r0
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.mo126271I(r4)
        L_0x002c:
            r2.mo134734J7()
            o83.d r3 = r2.f282910d
            r3.mo139554b(r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.emojistore.p476ui.SosSimilarUI.mo126274X1(bq.m1, androidx.recyclerview.widget.RecyclerView$e):void");
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
        C100299d dVar = this.f282910d;
        Intent intent = getIntent();
        dVar.getClass();
        C87412m.m108594g(intent, "intent");
        C86709a0.m107524d().mo123455a(2999, dVar);
        C86709a0.m107524d().mo123455a(719, dVar);
        dVar.f293817e = (SimilarEmojiQueryModel) intent.getParcelableExtra("KEY_NET_PARAM");
        l54 l54 = (l54) ((C77049b) C86312j.m106911c(C77049b.class)).mo72356fq(this, 1, 1, l54.class);
        if (l54 != null) {
            String str2 = l54.f137188d;
            if (str2 == null) {
                str2 = "";
            }
            dVar.f293820h = str2;
            Log.m105924i("MicroMsg.SimilarEmoji", "report sessionId=" + dVar.f293820h);
        }
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        RecyclerView ZQ = ((C28385n1) C86312j.m106911c(C28385n1.class)).mo55772ZQ(new C85978w1(context, C0966R.style.f8435id));
        this.f282912f = ZQ;
        if (ZQ != null) {
            ZQ.setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
        }
        RecyclerView recyclerView = this.f282912f;
        C92286m1 m1Var = recyclerView instanceof C92286m1 ? (C92286m1) recyclerView : null;
        if (m1Var != null) {
            m1Var.setOnLoadingStateChangedListener(this);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        TouchableLayout touchableLayout = new TouchableLayout(this);
        RecyclerView recyclerView2 = this.f282912f;
        if (recyclerView2 != null) {
            recyclerView2.setPadding(mo134732H7(), 0, mo134732H7(), 0);
        }
        touchableLayout.addView(this.f282912f, layoutParams);
        setContentView(touchableLayout, layoutParams);
        SimilarEmojiQueryModel similarEmojiQueryModel = this.f282910d.f293817e;
        if (similarEmojiQueryModel == null || (str = similarEmojiQueryModel.f283910d) == null) {
            str = MMApplicationContext.getContext().getString(C0966R.string.jkp);
            C87412m.m108593f(str, "getContext().getString(c….sos_similar_emoji_title)");
        }
        setMMTitle(str);
        setBackBtn(new C96624a(this));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.f44666B = new C96625b(this, gridLayoutManager);
        RecyclerView recyclerView3 = this.f282912f;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView4 = this.f282912f;
        if (recyclerView4 != null) {
            recyclerView4.setItemViewCacheSize(0);
        }
        RecyclerView recyclerView5 = this.f282912f;
        if (recyclerView5 != null) {
            C98746w wVar = this.f282911e;
            C87412m.m108592e(wVar, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            recyclerView5.setAdapter((RecyclerView.C16613e) wVar);
        }
        this.f282911e.mo138124Z(new C96626c(this));
        this.f282911e.mo125847A(false);
        IEmojiInfo a = this.f282910d.mo139553a();
        if (a != null) {
            if (this.f282910d.mo139555c()) {
                this.f282911e.mo125854u2(a);
            } else {
                this.f282911e.mo125855y(a);
            }
            this.f282911e.mo125850d3();
        }
        this.f282911e.notifyDataSetChanged();
        this.f282910d.mo139554b(this);
        C115669n.INSTANCE.mo175912v(1257, 3);
    }

    public void onDestroy() {
        mo134734J7();
        super.onDestroy();
        C100299d dVar = this.f282910d;
        dVar.f293816d = null;
        C86709a0.m107529k().f251779b.mo123457c(2999);
        C86709a0.m107529k().f251779b.mo123470p(2999, dVar);
        C86709a0.m107529k().f251779b.mo123457c(719);
        C86709a0.m107524d().mo123470p(719, dVar);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        RecyclerView recyclerView = this.f282912f;
        C92286m1 m1Var = recyclerView instanceof C92286m1 ? (C92286m1) recyclerView : null;
        if (m1Var != null) {
            m1Var.mo126271I(false);
        }
        if (i == 0 && i2 == 0 && this.f282910d.f293823n.size() > 1) {
            int itemCount = this.f282911e.getItemCount();
            this.f282911e.mo125847A(true);
            this.f282911e.mo138125c(this.f282910d.f293823n);
            if (itemCount - 2 <= 0) {
                this.f282911e.notifyDataSetChanged();
                return;
            }
            this.f282911e.notifyItemChanged(itemCount - 1);
        } else {
            Log.m105924i("MicroMsg.WebSearch.SosSimilarUI", "onSceneEnd errType:" + i + " errCode:" + i2 + " errMsg:" + str + ' ');
            this.f282911e.mo125853t3(new ArrayList());
            IEmojiInfo a = this.f282910d.mo139553a();
            if (a != null) {
                if (this.f282910d.mo139555c()) {
                    this.f282911e.mo125854u2(a);
                } else {
                    this.f282911e.mo125855y(a);
                }
            }
            this.f282911e.mo125852j3();
            this.f282911e.notifyDataSetChanged();
        }
        mo134734J7();
    }
}
