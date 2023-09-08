package com.tencent.p014mm.p136ui.bizchat;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.bizchat.BizChatSearchListView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kv1.C99254i;
import lv1.C99667f;
import nj3.C88989a;
import ob0.C11385n;
import p214om.C11502f;
import p227rn.C48053v;
import p248ug.C52556a;
import p248ug.C52558c;
import p629ny.C76979h;
import p716uu.C52617d;
import qj3.C47864f;
import rb0.C47969h;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48329b;
import sb0.C48334c;
import sb0.C48340e;
import sb0.C48353j;
import sb0.C48358l;
import te3.C48848bf;
import te3.C49275ef;
import te3.C49566gj;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI */
public class BizChatSearchUI extends MMActivity implements C52617d.C52618a, BizChatSearchListView.C44734a {

    /* renamed from: d */
    public String f121369d;

    /* renamed from: e */
    public String f121370e;

    /* renamed from: f */
    public int f121371f;

    /* renamed from: g */
    public String f121372g;

    /* renamed from: h */
    public C44740e f121373h;

    /* renamed from: i */
    public C114760b f121374i;

    /* renamed from: j */
    public BizChatSearchListView f121375j;

    /* renamed from: n */
    public TextView f121376n;

    /* renamed from: o */
    public C44737c f121377o;

    /* renamed from: p */
    public AbsListView.OnScrollListener f121378p = new C44735a();

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$a */
    public class C44735a implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public boolean f121379d = false;

        public C44735a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i + i2 == i3) {
                this.f121379d = true;
            } else {
                this.f121379d = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && this.f121379d) {
                C44737c cVar = BizChatSearchUI.this.f121377o;
                if (cVar.f121387E && cVar.mo69984f() && !cVar.f121389G) {
                    cVar.f121389G = true;
                    C97625j3.m125815e().mo123460f(new C48358l(cVar.f121397d, cVar.f121400g, cVar.f121396N, (Object) null));
                    cVar.mo69985g();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$b */
    public class C44736b implements AdapterView.OnItemClickListener {
        public C44736b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatSearchUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C44744i b = BizChatSearchUI.this.f121377o.getItem(i);
            BizChatSearchUI bizChatSearchUI = BizChatSearchUI.this;
            bizChatSearchUI.getClass();
            Class<BizChatSearchUI> cls = BizChatSearchUI.class;
            int i2 = b.f121432a;
            if (i2 == 1 || i2 == 2) {
                Object obj = b.f121433b;
                long j2 = -1;
                if (obj instanceof C48334c) {
                    C48334c cVar = (C48334c) obj;
                    if (cVar != null) {
                        j2 = cVar.field_bizChatLocalId;
                    }
                } else if (obj instanceof C48848bf) {
                    C49275ef efVar = ((C48848bf) obj).f131073d;
                    String str = bizChatSearchUI.f121369d;
                    C48353j jVar = new C48353j();
                    jVar.field_userId = efVar.f132889d;
                    jVar.field_userName = efVar.f132890e;
                    jVar.field_brandUserName = str;
                    jVar.field_headImageUrl = efVar.f132892g;
                    jVar.field_profileUrl = efVar.f132893h;
                    jVar.field_UserVersion = efVar.f132891f;
                    jVar.field_addMemberUrl = efVar.f132895j;
                    if (!C48009v0.Bx0().mo73075Lo(jVar) ? C48009v0.Bx0().insert(jVar) : true) {
                        C48334c cVar2 = new C48334c();
                        cVar2.field_bizChatServId = jVar.field_userId;
                        cVar2.field_brandUserName = jVar.field_brandUserName;
                        cVar2.field_chatName = jVar.field_userName;
                        cVar2.field_chatType = 1;
                        C48334c n = C48340e.m53673n(cVar2);
                        if (n != null) {
                            C48327a Yt = C48009v0.Dx0().mo73024Yt(n.field_bizChatLocalId);
                            Yt.field_bizChatId = n.field_bizChatLocalId;
                            Yt.field_unReadCount = 0;
                            if (Util.isNullOrNil(Yt.field_brandUserName)) {
                                Yt.field_brandUserName = n.field_brandUserName;
                                long currentTimeMillis = System.currentTimeMillis();
                                Yt.field_lastMsgTime = currentTimeMillis;
                                Yt.field_flag = currentTimeMillis;
                            }
                            if (!C48009v0.Dx0().mo73020LL(Yt)) {
                                C48009v0.Dx0().insert(Yt);
                            }
                            j2 = n.field_bizChatLocalId;
                        }
                    }
                }
                if (!Util.isNullOrNil(bizChatSearchUI.f121369d) && j2 >= 0) {
                    Intent intent = new Intent();
                    intent.putExtra("Chat_User", bizChatSearchUI.f121369d);
                    intent.putExtra("key_biz_chat_id", j2);
                    intent.putExtra("finish_direct", true);
                    intent.putExtra("key_need_send_video", false);
                    intent.putExtra("key_is_biz_chat", true);
                    C88144b.m109801s(bizChatSearchUI.getContext(), ".ui.chatting.ChattingUI", intent, (Bundle) null);
                }
            } else if (i2 == 6) {
                try {
                    C49566gj gjVar = (C49566gj) ((C47864f) b.f121433b).f128466b;
                    if (gjVar != null) {
                        boolean m = C47984k.m53339m(gjVar.f134062d);
                        boolean OE = ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(gjVar.f134062d);
                        C52558c b2 = C47984k.m53328b(gjVar.f134062d);
                        String B = b2 == null ? null : b2.mo72807B();
                        if (B == null) {
                            B = "";
                        }
                        if (m) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("rawUrl", B);
                            intent2.putExtra("useJs", true);
                            intent2.putExtra("srcUsername", gjVar.f134062d);
                            intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                            intent2.addFlags(67108864);
                            C88144b.m109791i(bizChatSearchUI.getContext(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                            bizChatSearchUI.mo69976H7(b2, 2);
                        } else if (OE) {
                            Intent intent3 = new Intent();
                            intent3.putExtra("Contact_User", gjVar.f134062d);
                            intent3.addFlags(67108864);
                            intent3.putExtra("biz_chat_from_scene", 3);
                            C88144b.m109801s(bizChatSearchUI.getContext(), ".ui.bizchat.BizChatConversationUI", intent3, (Bundle) null);
                        } else {
                            Intent intent4 = new Intent();
                            intent4.addFlags(67108864);
                            intent4.putExtra("finish_direct", true);
                            intent4.putExtra("Chat_User", gjVar.f134062d);
                            intent4.putExtra("chat_from_scene", 2);
                            AppCompatActivity context = bizChatSearchUI.getContext();
                            Log.m105924i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
                            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent4, context);
                            bizChatSearchUI.mo69976H7(b2, 1);
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (i2 == 3) {
                if (((Integer) b.f121433b).intValue() == 1) {
                    Intent intent5 = new Intent(bizChatSearchUI.getContext(), cls);
                    intent5.putExtra("enterprise_biz_name", bizChatSearchUI.f121369d);
                    intent5.putExtra("biz_chat_search_scene", 2);
                    intent5.putExtra("biz_chat_search_text", bizChatSearchUI.f121374i.mo153855g());
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent5);
                    BizChatSearchUI bizChatSearchUI2 = bizChatSearchUI;
                    C117292a.m165358d(bizChatSearchUI2, aVar.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    bizChatSearchUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(bizChatSearchUI2, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (((Integer) b.f121433b).intValue() == 2) {
                    Intent intent6 = new Intent(bizChatSearchUI.getContext(), cls);
                    intent6.putExtra("enterprise_biz_name", bizChatSearchUI.f121369d);
                    intent6.putExtra("biz_chat_search_scene", 3);
                    intent6.putExtra("biz_chat_search_text", bizChatSearchUI.f121374i.mo153855g());
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent6);
                    BizChatSearchUI bizChatSearchUI3 = bizChatSearchUI;
                    C117292a.m165358d(bizChatSearchUI3, aVar2.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreGroupUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    bizChatSearchUI.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(bizChatSearchUI3, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreGroupUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (((Integer) b.f121433b).intValue() == 3) {
                    Intent intent7 = new Intent(bizChatSearchUI.getContext(), cls);
                    intent7.putExtra("enterprise_biz_name", bizChatSearchUI.f121369d);
                    intent7.putExtra("enterprise_biz_father_name", bizChatSearchUI.f121370e);
                    intent7.putExtra("biz_chat_search_scene", 4);
                    intent7.putExtra("biz_chat_search_text", bizChatSearchUI.f121374i.mo153855g());
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent7);
                    BizChatSearchUI bizChatSearchUI4 = bizChatSearchUI;
                    C117292a.m165358d(bizChatSearchUI4, aVar3.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreAppUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    bizChatSearchUI.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(bizChatSearchUI4, "com/tencent/mm/ui/bizchat/BizChatSearchUI", "goToMoreAppUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatSearchUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$c */
    public static class C44737c extends BaseAdapter implements C11385n {

        /* renamed from: P */
        public static final /* synthetic */ int f121382P = 0;

        /* renamed from: A */
        public C44744i f121383A;

        /* renamed from: B */
        public C44744i f121384B;

        /* renamed from: C */
        public ArrayList<C44744i> f121385C = new ArrayList<>();

        /* renamed from: D */
        public C44744i f121386D;

        /* renamed from: E */
        public boolean f121387E = true;

        /* renamed from: F */
        public boolean f121388F;

        /* renamed from: G */
        public boolean f121389G;

        /* renamed from: H */
        public boolean f121390H;

        /* renamed from: I */
        public boolean f121391I;

        /* renamed from: J */
        public int f121392J;

        /* renamed from: K */
        public int f121393K;

        /* renamed from: L */
        public int f121394L;

        /* renamed from: M */
        public boolean f121395M;

        /* renamed from: N */
        public int f121396N;

        /* renamed from: d */
        public String f121397d;

        /* renamed from: e */
        public String f121398e;

        /* renamed from: f */
        public int f121399f;

        /* renamed from: g */
        public String f121400g;

        /* renamed from: h */
        public C20937c f121401h;

        /* renamed from: i */
        public Context f121402i;

        /* renamed from: j */
        public int f121403j;

        /* renamed from: n */
        public boolean f121404n;

        /* renamed from: o */
        public boolean f121405o;

        /* renamed from: p */
        public boolean f121406p;

        /* renamed from: q */
        public ArrayList<C48334c> f121407q = new ArrayList<>();

        /* renamed from: r */
        public ArrayList<Object> f121408r = new ArrayList<>();

        /* renamed from: s */
        public ArrayList<C48334c> f121409s = new ArrayList<>();

        /* renamed from: t */
        public ArrayList<C47864f> f121410t = new ArrayList<>();

        /* renamed from: u */
        public List<C47864f> f121411u;

        /* renamed from: v */
        public C44744i f121412v;

        /* renamed from: w */
        public ArrayList<C44744i> f121413w = new ArrayList<>();

        /* renamed from: x */
        public C44744i f121414x;

        /* renamed from: y */
        public C44744i f121415y;

        /* renamed from: z */
        public ArrayList<C44744i> f121416z = new ArrayList<>();

        /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$c$a */
        public class C44738a implements Comparator<C47864f> {
            public C44738a(C44737c cVar, C44735a aVar) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
                if (r1 != false) goto L_0x0026;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public int compare(java.lang.Object r10, java.lang.Object r11) {
                /*
                    r9 = this;
                    qj3.f r10 = (qj3.C47864f) r10
                    qj3.f r11 = (qj3.C47864f) r11
                    java.lang.String r0 = r10.f128465a
                    java.lang.String r1 = r11.f128465a
                    r2 = 0
                    if (r0 == 0) goto L_0x0012
                    if (r1 == 0) goto L_0x0012
                    int r3 = r0.compareToIgnoreCase(r1)
                    goto L_0x0013
                L_0x0012:
                    r3 = 0
                L_0x0013:
                    r4 = -1
                    r5 = 1
                    if (r3 == 0) goto L_0x002c
                    java.lang.String r10 = "#"
                    boolean r11 = r0.equalsIgnoreCase(r10)
                    if (r11 == 0) goto L_0x0020
                    r3 = 1
                L_0x0020:
                    boolean r10 = r1.equalsIgnoreCase(r10)
                    if (r10 == 0) goto L_0x0029
                L_0x0026:
                    r2 = -1
                    goto L_0x0145
                L_0x0029:
                    r2 = r3
                    goto L_0x0145
                L_0x002c:
                    java.lang.Object r10 = r10.f128466b
                    te3.gj r10 = (te3.C49566gj) r10
                    java.lang.Object r11 = r11.f128466b
                    te3.gj r11 = (te3.C49566gj) r11
                    if (r0 == 0) goto L_0x0080
                    if (r1 == 0) goto L_0x0080
                    java.lang.String r1 = "!2"
                    boolean r1 = r0.equalsIgnoreCase(r1)
                    if (r1 != 0) goto L_0x0048
                    java.lang.String r1 = "!1"
                    boolean r0 = r0.equalsIgnoreCase(r1)
                    if (r0 == 0) goto L_0x0080
                L_0x0048:
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    int r0 = r0.mo62901g3()
                    com.tencent.mm.storage.z1 r1 = r11.f134063e
                    int r1 = r1.mo62901g3()
                    r3 = 90
                    r6 = 122(0x7a, float:1.71E-43)
                    r7 = 65
                    r8 = 97
                    if (r0 < r8) goto L_0x0060
                    if (r0 <= r6) goto L_0x0065
                L_0x0060:
                    if (r0 < r7) goto L_0x0067
                    if (r0 <= r3) goto L_0x0065
                    goto L_0x0067
                L_0x0065:
                    r0 = 0
                    goto L_0x0068
                L_0x0067:
                    r0 = 1
                L_0x0068:
                    if (r1 < r8) goto L_0x006c
                    if (r1 <= r6) goto L_0x0071
                L_0x006c:
                    if (r1 < r7) goto L_0x0073
                    if (r1 <= r3) goto L_0x0071
                    goto L_0x0073
                L_0x0071:
                    r1 = 0
                    goto L_0x0074
                L_0x0073:
                    r1 = 1
                L_0x0074:
                    if (r0 == 0) goto L_0x007b
                    if (r1 != 0) goto L_0x007b
                    r2 = 1
                    goto L_0x0145
                L_0x007b:
                    if (r0 != 0) goto L_0x0080
                    if (r1 == 0) goto L_0x0080
                    goto L_0x0026
                L_0x0080:
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    if (r0 == 0) goto L_0x00bd
                    java.lang.String r0 = r0.mo62945z2()
                    if (r0 == 0) goto L_0x00bd
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    java.lang.String r0 = r0.mo62945z2()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x00bd
                    com.tencent.mm.storage.z1 r0 = r11.f134063e
                    if (r0 == 0) goto L_0x00bd
                    java.lang.String r0 = r0.mo62945z2()
                    if (r0 == 0) goto L_0x00bd
                    com.tencent.mm.storage.z1 r0 = r11.f134063e
                    java.lang.String r0 = r0.mo62945z2()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x00bd
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    java.lang.String r0 = r0.mo62945z2()
                    com.tencent.mm.storage.z1 r1 = r11.f134063e
                    java.lang.String r1 = r1.mo62945z2()
                    int r0 = r0.compareToIgnoreCase(r1)
                    goto L_0x00be
                L_0x00bd:
                    r0 = 0
                L_0x00be:
                    if (r0 == 0) goto L_0x00c3
                L_0x00c0:
                    r2 = r0
                    goto L_0x0145
                L_0x00c3:
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    if (r0 == 0) goto L_0x0100
                    java.lang.String r0 = r0.getNickname()
                    if (r0 == 0) goto L_0x0100
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    java.lang.String r0 = r0.getNickname()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0100
                    com.tencent.mm.storage.z1 r0 = r11.f134063e
                    if (r0 == 0) goto L_0x0100
                    java.lang.String r0 = r0.getNickname()
                    if (r0 == 0) goto L_0x0100
                    com.tencent.mm.storage.z1 r0 = r11.f134063e
                    java.lang.String r0 = r0.getNickname()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0100
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    java.lang.String r0 = r0.getNickname()
                    com.tencent.mm.storage.z1 r1 = r11.f134063e
                    java.lang.String r1 = r1.getNickname()
                    int r0 = r0.compareToIgnoreCase(r1)
                    goto L_0x0101
                L_0x0100:
                    r0 = 0
                L_0x0101:
                    if (r0 == 0) goto L_0x0104
                    goto L_0x00c0
                L_0x0104:
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    if (r0 == 0) goto L_0x0141
                    java.lang.String r0 = r0.getUsername()
                    if (r0 == 0) goto L_0x0141
                    com.tencent.mm.storage.z1 r0 = r10.f134063e
                    java.lang.String r0 = r0.getUsername()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0141
                    com.tencent.mm.storage.z1 r0 = r11.f134063e
                    if (r0 == 0) goto L_0x0141
                    java.lang.String r0 = r0.getUsername()
                    if (r0 == 0) goto L_0x0141
                    com.tencent.mm.storage.z1 r0 = r11.f134063e
                    java.lang.String r0 = r0.getUsername()
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x0141
                    com.tencent.mm.storage.z1 r10 = r10.f134063e
                    java.lang.String r10 = r10.getUsername()
                    com.tencent.mm.storage.z1 r11 = r11.f134063e
                    java.lang.String r11 = r11.getUsername()
                    int r10 = r10.compareToIgnoreCase(r11)
                    goto L_0x0142
                L_0x0141:
                    r10 = 0
                L_0x0142:
                    if (r10 == 0) goto L_0x0145
                    r2 = r10
                L_0x0145:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44737c.C44738a.compare(java.lang.Object, java.lang.Object):int");
            }
        }

        public C44737c(Context context, String str, String str2, int i) {
            int i2;
            boolean z = false;
            this.f121388F = false;
            this.f121389G = false;
            this.f121390H = true;
            this.f121391I = true;
            this.f121392J = 0;
            this.f121393K = 0;
            this.f121394L = 0;
            this.f121395M = false;
            this.f121396N = 0;
            this.f121402i = context;
            this.f121397d = str;
            this.f121398e = str2;
            this.f121399f = i;
            this.f121404n = i == 1 || i == 2;
            int i3 = 3;
            this.f121405o = i == 1 || i == 3;
            if (!Util.isNullOrNil(str2) && ((i2 = this.f121399f) == 1 || i2 == 4)) {
                z = true;
            }
            this.f121406p = z;
            this.f121403j = this.f121399f != 1 ? Integer.MAX_VALUE : i3;
            C20937c.C20939b bVar = new C20937c.C20939b();
            String str3 = this.f121397d;
            String str4 = C48340e.f129426a;
            bVar.f59351g = C52556a.m58840a(str3);
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = C0966R.raw.default_avatar;
            this.f121401h = bVar.mo32666a();
            if (this.f121406p) {
                ArrayList arrayList = new ArrayList();
                Cursor DN = C48009v0.Fx0().mo72753DN(this.f121398e, true);
                while (DN.moveToNext()) {
                    C49566gj gjVar = new C49566gj();
                    C72996z1 z1Var = new C72996z1();
                    z1Var.convertFrom(DN);
                    C52558c cVar = new C52558c();
                    cVar.convertFrom(DN);
                    gjVar.f134062d = z1Var.getUsername();
                    gjVar.f134063e = z1Var;
                    gjVar.f134064f = cVar;
                    C47864f fVar = new C47864f();
                    fVar.f128466b = gjVar;
                    if (gjVar.f134064f.mo73501s2()) {
                        fVar.f128465a = "!1";
                    } else if (gjVar.f134063e.mo62940x3()) {
                        fVar.f128465a = "!2";
                    } else {
                        int g3 = gjVar.f134063e.mo62901g3();
                        if (g3 >= 97 && g3 <= 122) {
                            g3 -= 32;
                        }
                        if (g3 < 65 || g3 > 90) {
                            fVar.f128465a = "#";
                        } else {
                            fVar.f128465a = ((char) g3) + "";
                        }
                    }
                    arrayList.add(fVar);
                }
                DN.close();
                Collections.sort(arrayList, new C44738a(this, (C44735a) null));
                this.f121411u = arrayList;
            }
            if (this.f121404n) {
                C97625j3.m125815e().mo123455a(1364, this);
            }
        }

        /* renamed from: a */
        public final void mo69981a() {
            this.f121396N = 0;
            this.f121408r.clear();
            this.f121407q.clear();
            this.f121409s.clear();
        }

        /* renamed from: b */
        public C44744i getItem(int i) {
            int i2 = this.f121392J;
            if (i >= i2) {
                int i3 = this.f121393K;
                if (i < i3) {
                    if (i == i2) {
                        if (this.f121415y == null) {
                            this.f121415y = new C44744i(5, 2);
                        }
                        return this.f121415y;
                    } else if (i != this.f121394L - 1 || !this.f121390H || !mo69983d()) {
                        int i4 = (i - this.f121392J) - 1;
                        if (i4 >= 0 && i4 < this.f121416z.size()) {
                            return this.f121416z.get(i4);
                        }
                    } else {
                        if (this.f121383A == null) {
                            this.f121383A = new C44744i(3, 2);
                        }
                        return this.f121383A;
                    }
                } else if (i == i3) {
                    if (this.f121384B == null) {
                        this.f121384B = new C44744i(5, 3);
                    }
                    return this.f121384B;
                } else if (i != this.f121394L - 1 || !this.f121391I || !mo69983d()) {
                    int i5 = (i - this.f121393K) - 1;
                    if (i5 >= 0 && i5 < this.f121385C.size()) {
                        return this.f121385C.get(i5);
                    }
                } else {
                    if (this.f121386D == null) {
                        this.f121386D = new C44744i(3, 3);
                    }
                    return this.f121386D;
                }
            } else if (i == 0) {
                if (this.f121412v == null) {
                    this.f121412v = new C44744i(5, 1);
                }
                return this.f121412v;
            } else if (i == i2 - 1 && this.f121388F && mo69983d()) {
                if (this.f121414x == null) {
                    this.f121414x = new C44744i();
                }
                C44744i iVar = this.f121414x;
                iVar.f121432a = 4;
                iVar.f121433b = 1;
                return this.f121414x;
            } else if (i != this.f121392J - 1 || !this.f121387E || !mo69983d()) {
                int i6 = i - 1;
                if (i6 >= 0 && i6 < this.f121413w.size()) {
                    return this.f121413w.get(i6);
                }
            } else {
                if (this.f121414x == null) {
                    this.f121414x = new C44744i();
                }
                C44744i iVar2 = this.f121414x;
                iVar2.f121432a = 3;
                iVar2.f121433b = 1;
                return this.f121414x;
            }
            return new C44744i();
        }

        /* renamed from: d */
        public final boolean mo69983d() {
            return this.f121399f == 1;
        }

        /* renamed from: f */
        public final boolean mo69984f() {
            return this.f121399f == 2;
        }

        /* renamed from: g */
        public final void mo69985g() {
            BizChatSearchUI bizChatSearchUI = (BizChatSearchUI) this.f121402i;
            bizChatSearchUI.getClass();
            if (!mo69983d()) {
                if (Util.isNullOrNil(this.f121400g)) {
                    bizChatSearchUI.f121376n.setVisibility(0);
                    bizChatSearchUI.f121376n.setText("");
                    bizChatSearchUI.f121375j.setVisibility(8);
                } else if (mo69984f() && this.f121388F) {
                    bizChatSearchUI.f121376n.setVisibility(0);
                    bizChatSearchUI.f121376n.setText(C0966R.string.arq);
                    bizChatSearchUI.f121375j.setVisibility(8);
                } else if (mo69984f() && this.f121395M) {
                    bizChatSearchUI.f121376n.setVisibility(0);
                    bizChatSearchUI.f121376n.setText(C0966R.string.arr);
                    bizChatSearchUI.f121375j.setVisibility(8);
                } else if (this.f121394L <= 0) {
                    bizChatSearchUI.f121376n.setVisibility(0);
                    TextView textView = bizChatSearchUI.f121376n;
                    String string = bizChatSearchUI.getString(C0966R.string.igo);
                    String string2 = bizChatSearchUI.getString(C0966R.string.ign);
                    String str = this.f121400g;
                    textView.setText(C99254i.m129307d(string, string2, C99667f.m130088a(str, str, false, false)).f292107a);
                    bizChatSearchUI.f121375j.setVisibility(8);
                } else {
                    bizChatSearchUI.f121376n.setVisibility(8);
                    bizChatSearchUI.f121375j.setVisibility(0);
                }
                if (!mo69984f()) {
                    return;
                }
                if (this.f121389G) {
                    bizChatSearchUI.mo69977I7(1);
                } else if (this.f121387E) {
                    bizChatSearchUI.mo69977I7(2);
                } else {
                    bizChatSearchUI.mo69977I7(0);
                }
            } else if (Util.isNullOrNil(this.f121400g)) {
                bizChatSearchUI.f121376n.setVisibility(8);
                bizChatSearchUI.f121375j.setVisibility(8);
            } else if (this.f121394L <= 0) {
                bizChatSearchUI.f121376n.setVisibility(0);
                bizChatSearchUI.f121375j.setVisibility(8);
            } else {
                bizChatSearchUI.f121376n.setVisibility(8);
                bizChatSearchUI.f121375j.setVisibility(0);
            }
        }

        public int getCount() {
            return this.f121394L;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            C44744i b = getItem(i);
            if (b != null) {
                return b.f121432a;
            }
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x036f, code lost:
            if (r4 != r0.f121394L) goto L_0x0373;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0320  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0331  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0340  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0367  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                r2 = r29
                java.lang.Class<vr.h> r3 = p255vr.C78470h.class
                com.tencent.mm.ui.bizchat.BizChatSearchUI$i r4 = r26.getItem(r27)
                int r5 = r4.f121432a
                java.lang.String r6 = ""
                r7 = 2
                r8 = 2131312931(0x7f094123, float:1.8244244E38)
                r9 = 0
                r10 = 1
                if (r5 == r10) goto L_0x0242
                if (r5 == r7) goto L_0x0242
                r11 = 6
                if (r5 != r11) goto L_0x001f
                goto L_0x0242
            L_0x001f:
                r11 = 5
                r12 = 2131315306(0x7f094a6a, float:1.8249062E38)
                r13 = 3
                if (r5 != r11) goto L_0x013e
                if (r28 != 0) goto L_0x0055
                android.content.Context r5 = r0.f121402i
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                r11 = 2131493293(0x7f0c01ad, float:1.8610062E38)
                android.view.View r2 = r5.inflate(r11, r2, r9)
                com.tencent.mm.ui.bizchat.BizChatSearchUI$d r5 = new com.tencent.mm.ui.bizchat.BizChatSearchUI$d
                r5.<init>()
                android.view.View r11 = r2.findViewById(r12)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r5.f121418b = r11
                r11 = 2131310717(0x7f09387d, float:1.8239754E38)
                android.view.View r11 = r2.findViewById(r11)
                r5.f121419c = r11
                android.view.View r8 = r2.findViewById(r8)
                r5.f121417a = r8
                r2.setTag(r5)
                goto L_0x0057
            L_0x0055:
                r2 = r28
            L_0x0057:
                java.lang.Object r5 = r2.getTag()
                com.tencent.mm.ui.bizchat.BizChatSearchUI$d r5 = (com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44739d) r5
                java.lang.Object r8 = r4.f121433b
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                if (r8 != r10) goto L_0x0075
                android.content.Context r4 = r0.f121402i
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131822833(0x7f1108f1, float:1.9278449E38)
                java.lang.String r6 = r4.getString(r6)
                goto L_0x00a4
            L_0x0075:
                java.lang.Object r8 = r4.f121433b
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                if (r8 != r7) goto L_0x008d
                android.content.Context r4 = r0.f121402i
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131822825(0x7f1108e9, float:1.9278432E38)
                java.lang.String r6 = r4.getString(r6)
                goto L_0x00a4
            L_0x008d:
                java.lang.Object r4 = r4.f121433b
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 != r13) goto L_0x00a4
                android.content.Context r4 = r0.f121402i
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131822824(0x7f1108e8, float:1.927843E38)
                java.lang.String r6 = r4.getString(r6)
            L_0x00a4:
                di3.d r3 = di3.C86312j.m106911c(r3)
                vr.h r3 = (p255vr.C78470h) r3
                android.widget.TextView r4 = r5.f121418b
                r3.mo108300VH(r6, r4)
                if (r1 != 0) goto L_0x00f4
                android.view.View r1 = r5.f121419c
                r3 = 8
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4.mo10233c(r3)
                java.lang.Object[] r11 = r4.mo10232b()
                java.lang.String r12 = "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatConversationSearchAdapter"
                java.lang.String r13 = "createHeaderView"
                java.lang.String r14 = "(Lcom/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatSearchDataItem;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r1
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r3 = r4.mo10231a(r9)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r11 = "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatConversationSearchAdapter"
                java.lang.String r12 = "createHeaderView"
                java.lang.String r13 = "(Lcom/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatSearchDataItem;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x0135
            L_0x00f4:
                android.view.View r1 = r5.f121419c
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
                r3.mo10233c(r4)
                java.lang.Object[] r18 = r3.mo10232b()
                java.lang.String r19 = "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatConversationSearchAdapter"
                java.lang.String r20 = "createHeaderView"
                java.lang.String r21 = "(Lcom/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatSearchDataItem;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r1
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.Object r3 = r3.mo10231a(r9)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r18 = "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatConversationSearchAdapter"
                java.lang.String r19 = "createHeaderView"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatSearchDataItem;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            L_0x0135:
                android.view.View r1 = r5.f121417a
                r3 = 2131233607(0x7f080b47, float:1.8083356E38)
                r1.setBackgroundResource(r3)
                return r2
            L_0x013e:
                if (r5 != r13) goto L_0x01e5
                if (r28 != 0) goto L_0x0171
                android.content.Context r1 = r0.f121402i
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r3 = 2131493294(0x7f0c01ae, float:1.8610064E38)
                android.view.View r1 = r1.inflate(r3, r2, r9)
                com.tencent.mm.ui.bizchat.BizChatSearchUI$g r2 = new com.tencent.mm.ui.bizchat.BizChatSearchUI$g
                r2.<init>()
                android.view.View r3 = r1.findViewById(r12)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f121426b = r3
                r3 = 2131306206(0x7f0926de, float:1.8230605E38)
                android.view.View r3 = r1.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r2.f121427c = r3
                android.view.View r3 = r1.findViewById(r8)
                r2.f121425a = r3
                r1.setTag(r2)
                goto L_0x0173
            L_0x0171:
                r1 = r28
            L_0x0173:
                java.lang.Object r2 = r1.getTag()
                com.tencent.mm.ui.bizchat.BizChatSearchUI$g r2 = (com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44742g) r2
                java.lang.Object r3 = r4.f121433b
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r3 != r10) goto L_0x0191
                android.content.Context r3 = r0.f121402i
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131822832(0x7f1108f0, float:1.9278447E38)
                java.lang.String r6 = r3.getString(r5)
                goto L_0x01c0
            L_0x0191:
                java.lang.Object r3 = r4.f121433b
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r3 != r7) goto L_0x01a9
                android.content.Context r3 = r0.f121402i
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131822831(0x7f1108ef, float:1.9278445E38)
                java.lang.String r6 = r3.getString(r5)
                goto L_0x01c0
            L_0x01a9:
                java.lang.Object r3 = r4.f121433b
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r3 != r13) goto L_0x01c0
                android.content.Context r3 = r0.f121402i
                android.content.res.Resources r3 = r3.getResources()
                r5 = 2131822830(0x7f1108ee, float:1.9278442E38)
                java.lang.String r6 = r3.getString(r5)
            L_0x01c0:
                java.lang.Object r3 = r4.f121433b
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r3 != r10) goto L_0x01d1
                int r3 = r0.f121392J
                int r4 = r0.f121394L
                if (r3 == r4) goto L_0x01d1
                goto L_0x01d2
            L_0x01d1:
                r9 = 1
            L_0x01d2:
                android.view.View r3 = r2.f121425a
                com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118698f(r3, r9)
                android.widget.TextView r3 = r2.f121426b
                r3.setText(r6)
                android.widget.ImageView r2 = r2.f121427c
                r3 = 2131755795(0x7f100313, float:1.914248E38)
                r2.setImageResource(r3)
                return r1
            L_0x01e5:
                r1 = 4
                if (r5 != r1) goto L_0x0240
                if (r28 != 0) goto L_0x020e
                android.content.Context r1 = r0.f121402i
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r3 = 2131495694(0x7f0c0b0e, float:1.8614932E38)
                android.view.View r1 = r1.inflate(r3, r2, r9)
                com.tencent.mm.ui.bizchat.BizChatSearchUI$f r2 = new com.tencent.mm.ui.bizchat.BizChatSearchUI$f
                r2.<init>()
                android.view.View r3 = r1.findViewById(r12)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r2.f121424b = r3
                android.view.View r3 = r1.findViewById(r8)
                r2.f121423a = r3
                r1.setTag(r2)
                goto L_0x0210
            L_0x020e:
                r1 = r28
            L_0x0210:
                java.lang.Object r2 = r1.getTag()
                com.tencent.mm.ui.bizchat.BizChatSearchUI$f r2 = (com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44741f) r2
                java.lang.Object r3 = r4.f121433b
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r3 != r10) goto L_0x0227
                int r3 = r0.f121392J
                int r4 = r0.f121394L
                if (r3 == r4) goto L_0x0227
                goto L_0x0228
            L_0x0227:
                r9 = 1
            L_0x0228:
                android.view.View r3 = r2.f121423a
                com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118698f(r3, r9)
                android.widget.TextView r2 = r2.f121424b
                android.content.Context r3 = r0.f121402i
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131822827(0x7f1108eb, float:1.9278436E38)
                java.lang.String r3 = r3.getString(r4)
                r2.setText(r3)
                return r1
            L_0x0240:
                r1 = 0
                return r1
            L_0x0242:
                if (r28 != 0) goto L_0x02a1
                android.content.Context r5 = r0.f121402i
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                r11 = 2131495673(0x7f0c0af9, float:1.861489E38)
                android.view.View r5 = r5.inflate(r11, r2, r9)
                int r11 = r29.getPaddingLeft()
                int r12 = r29.getPaddingRight()
                int r11 = r11 + r12
                int r2 = r29.getWidth()
                r12 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
                r13 = -1
                int r2 = android.view.ViewGroup.getChildMeasureSpec(r2, r11, r13)
                r11 = -2
                int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
                r5.measure(r2, r11)
                com.tencent.mm.ui.bizchat.BizChatSearchUI$h r2 = new com.tencent.mm.ui.bizchat.BizChatSearchUI$h
                r2.<init>()
                r11 = 2131297474(0x7f0904c2, float:1.8212894E38)
                android.view.View r11 = r5.findViewById(r11)
                android.widget.ImageView r11 = (android.widget.ImageView) r11
                r2.f121429b = r11
                r11 = 2131315432(0x7f094ae8, float:1.8249317E38)
                android.view.View r11 = r5.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r2.f121430c = r11
                r11 = 2131300854(0x7f0911f6, float:1.821975E38)
                android.view.View r11 = r5.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r2.f121431d = r11
                android.view.View r8 = r5.findViewById(r8)
                r2.f121428a = r8
                r5.setTag(r2)
                goto L_0x02a3
            L_0x02a1:
                r5 = r28
            L_0x02a3:
                java.lang.Object r2 = r5.getTag()
                com.tencent.mm.ui.bizchat.BizChatSearchUI$h r2 = (com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44743h) r2
                java.lang.Object r8 = r4.f121433b
                boolean r11 = r8 instanceof sb0.C48334c
                if (r11 == 0) goto L_0x02d9
                sb0.c r8 = (sb0.C48334c) r8
                if (r8 == 0) goto L_0x0311
                boolean r11 = r8.mo73037p2()
                if (r11 == 0) goto L_0x02be
                java.lang.String r11 = r8.field_chatName
                java.lang.String r8 = r8.field_headImageUrl
                goto L_0x0313
            L_0x02be:
                sb0.k r11 = rb0.C48009v0.Bx0()
                java.lang.String r12 = r8.field_bizChatServId
                sb0.j r11 = r11.get(r12)
                if (r11 == 0) goto L_0x02d4
                java.lang.String r8 = r11.field_userName
                java.lang.String r11 = r11.field_headImageUrl
                r25 = r11
                r11 = r8
                r8 = r25
                goto L_0x0313
            L_0x02d4:
                java.lang.String r11 = r8.field_chatName
                java.lang.String r8 = r8.field_headImageUrl
                goto L_0x0313
            L_0x02d9:
                boolean r11 = r8 instanceof te3.C48848bf
                if (r11 == 0) goto L_0x02f2
                te3.bf r8 = (te3.C48848bf) r8
                te3.ef r11 = r8.f131073d
                java.lang.String r12 = r11.f132890e
                java.lang.String r11 = r11.f132892g
                java.lang.String r13 = r8.f131074e
                java.lang.String r14 = "userid"
                boolean r13 = r14.equals(r13)
                r14 = r13 ^ 1
                java.lang.String r8 = r8.f131075f
                goto L_0x031e
            L_0x02f2:
                boolean r11 = r8 instanceof qj3.C47864f
                if (r11 == 0) goto L_0x0319
                qj3.f r8 = (qj3.C47864f) r8
                java.lang.Object r8 = r8.f128466b
                te3.gj r8 = (te3.C49566gj) r8
                if (r8 == 0) goto L_0x0311
                com.tencent.mm.storage.z1 r11 = r8.f134063e
                if (r11 == 0) goto L_0x0307
                java.lang.String r11 = r11.mo62898f()
                goto L_0x0308
            L_0x0307:
                r11 = r6
            L_0x0308:
                ug.c r8 = r8.f134064f
                if (r8 == 0) goto L_0x030f
                java.lang.String r8 = r8.field_brandIconURL
                goto L_0x0313
            L_0x030f:
                r8 = r6
                goto L_0x0313
            L_0x0311:
                r8 = r6
                r11 = r8
            L_0x0313:
                r12 = r11
                r13 = 0
                r14 = 1
                r11 = r8
                r8 = r6
                goto L_0x031e
            L_0x0319:
                r8 = r6
                r11 = r8
                r12 = r11
                r13 = 0
                r14 = 0
            L_0x031e:
                if (r14 == 0) goto L_0x0331
                android.content.Context r14 = r0.f121402i
                java.lang.String r15 = r0.f121400g
                android.text.Spannable r12 = kv1.C99254i.m129306c(r14, r12, r15)
                android.content.Context r14 = r0.f121402i
                int r15 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162738b
                android.text.SpannableString r12 = r0.mo69995k(r14, r12, r15)
                goto L_0x033e
            L_0x0331:
                android.content.Context r14 = r0.f121402i
                android.text.SpannableString r15 = new android.text.SpannableString
                r15.<init>(r12)
                int r12 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162738b
                android.text.SpannableString r12 = r0.mo69995k(r14, r15, r12)
            L_0x033e:
                if (r13 == 0) goto L_0x0363
                android.content.Context r6 = r0.f121402i
                r13 = 2131822835(0x7f1108f3, float:1.9278453E38)
                java.lang.String r6 = r6.getString(r13)
                android.content.Context r13 = r0.f121402i
                java.lang.String r14 = r0.f121400g
                android.text.Spannable r8 = kv1.C99254i.m129306c(r13, r8, r14)
                android.content.Context r13 = r0.f121402i
                int r14 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162738b
                android.text.SpannableString r8 = r0.mo69995k(r13, r8, r14)
                java.lang.CharSequence[] r7 = new java.lang.CharSequence[r7]
                r7[r9] = r6
                r7[r10] = r8
                java.lang.CharSequence r6 = android.text.TextUtils.concat(r7)
            L_0x0363:
                int r4 = r4.f121432a
                if (r4 != r10) goto L_0x0372
                int r4 = r0.f121392J
                int r7 = r4 + -1
                if (r1 != r7) goto L_0x0372
                int r1 = r0.f121394L
                if (r4 == r1) goto L_0x0372
                goto L_0x0373
            L_0x0372:
                r9 = 1
            L_0x0373:
                android.view.View r1 = r2.f121428a
                com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118698f(r1, r9)
                gc0.a r1 = gc0.C20828a.m22825b()
                android.widget.ImageView r4 = r2.f121429b
                hc0.c r7 = r0.f121401h
                r1.mo32519h(r11, r4, r7)
                di3.d r1 = di3.C86312j.m106911c(r3)
                vr.h r1 = (p255vr.C78470h) r1
                android.widget.TextView r4 = r2.f121430c
                r1.mo108300VH(r12, r4)
                di3.d r1 = di3.C86312j.m106911c(r3)
                vr.h r1 = (p255vr.C78470h) r1
                android.widget.TextView r2 = r2.f121431d
                r1.mo108300VH(r6, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44737c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return 7;
        }

        /* renamed from: h */
        public final void mo69992h(boolean z) {
            this.f121413w.clear();
            this.f121416z.clear();
            this.f121385C.clear();
            int i = 0;
            for (int i2 = 0; i2 < Math.min(this.f121403j, this.f121408r.size()); i2++) {
                this.f121413w.add(new C44744i(1, this.f121408r.get(i2)));
            }
            for (int i3 = 0; i3 < Math.min(this.f121403j, this.f121409s.size()); i3++) {
                this.f121416z.add(new C44744i(2, this.f121409s.get(i3)));
            }
            for (int i4 = 0; i4 < Math.min(this.f121403j, this.f121410t.size()); i4++) {
                this.f121385C.add(new C44744i(6, this.f121410t.get(i4)));
            }
            int size = this.f121408r.size();
            int size2 = this.f121409s.size();
            int size3 = this.f121410t.size();
            if (this.f121399f != 2) {
                this.f121387E = this.f121408r.size() > this.f121403j;
            }
            this.f121390H = this.f121409s.size() > this.f121403j;
            int size4 = this.f121410t.size();
            int i5 = this.f121403j;
            this.f121391I = size4 > i5;
            if (size > 0 || this.f121388F) {
                int min = Math.min(size, i5) + 1;
                if (mo69983d()) {
                    if (this.f121388F || this.f121387E) {
                        i = 1;
                    }
                    i += min;
                } else {
                    i = min;
                }
            }
            this.f121392J = i;
            if (size2 > 0) {
                i = i + 1 + Math.min(size2, this.f121403j);
                if (mo69983d()) {
                    i += this.f121390H ? 1 : 0;
                }
            }
            this.f121393K = i;
            if (size3 > 0) {
                i = i + 1 + Math.min(size3, this.f121403j);
                if (mo69983d()) {
                    i += this.f121391I ? 1 : 0;
                }
            }
            this.f121394L = i;
            if (z) {
                notifyDataSetChanged();
                mo69985g();
            }
        }

        /* renamed from: i */
        public final void mo69993i(String str) {
            List<C47864f> list;
            C49566gj gjVar;
            this.f121410t.clear();
            if (!Util.isNullOrNil(str) && (list = this.f121411u) != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    C47864f fVar = (C47864f) it.next();
                    boolean z = false;
                    if (!(Util.isNullOrNil(str) || fVar == null || (gjVar = (C49566gj) fVar.f128466b) == null)) {
                        String f = gjVar.f134063e.mo62898f();
                        String y2 = gjVar.f134063e.mo62942y2();
                        String z2 = gjVar.f134063e.mo62945z2();
                        String upperCase = str.toUpperCase();
                        if ((!Util.isNullOrNil(f) && f.toUpperCase().indexOf(upperCase) != -1) || ((!Util.isNullOrNil(y2) && y2.toUpperCase().indexOf(upperCase) != -1) || (!Util.isNullOrNil(z2) && z2.toUpperCase().startsWith(upperCase)))) {
                            z = true;
                        }
                    }
                    if (z) {
                        this.f121410t.add(fVar);
                    }
                }
            }
            mo69992h(true);
        }

        /* renamed from: j */
        public final void mo69994j(String str, boolean z) {
            C48329b Dx0 = C48009v0.Dx0();
            String str2 = this.f121397d;
            Dx0.getClass();
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            if (!Util.isNullOrNil(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("select ");
                sb.append("BizChatInfo");
                sb.append(".");
                sb.append("*");
                sb.append(" from ");
                sb.append("BizChatConversation");
                sb.append(" , ");
                sb.append("BizChatInfo");
                sb.append(" where ");
                sb.append("BizChatConversation");
                sb.append(".");
                sb.append("brandUserName");
                sb.append(" = '");
                sb.append(str2);
                sb.append("'");
                sb.append(" and ");
                sb.append("BizChatInfo");
                sb.append(".");
                sb.append("brandUserName");
                sb.append(" = '");
                sb.append(str2);
                sb.append("'");
                sb.append(" and ");
                sb.append("BizChatConversation");
                sb.append(".");
                sb.append("bizChatId");
                sb.append(" = ");
                sb.append("BizChatInfo");
                sb.append(".");
                sb.append("bizChatLocalId");
                sb.append(" and ");
                sb.append("BizChatInfo");
                sb.append(".");
                sb.append("chatName");
                sb.append(" like '%");
                sb.append(str);
                sb.append("%'");
                sb.append(" order by ");
                sb.append("BizChatConversation");
                sb.append(".");
                sb.append("flag");
                sb.append(" desc");
                sb.append(" , ");
                sb.append("BizChatConversation");
                sb.append(".");
                sb.append("lastMsgTime");
                sb.append(" desc");
                Log.m105919d("MicroMsg.BizConversationStorage", "getBizChatConversationSearchCursor: sql:%s", sb.toString());
                Cursor rawQuery = Dx0.rawQuery(sb.toString(), new String[0]);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        do {
                            C48334c cVar = new C48334c();
                            cVar.convertFrom(rawQuery);
                            arrayList.add(cVar);
                        } while (rawQuery.moveToNext());
                    }
                    rawQuery.close();
                }
            }
            mo69981a();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C48334c cVar2 = (C48334c) it.next();
                boolean p2 = cVar2.mo73037p2();
                if (p2 && this.f121405o) {
                    this.f121409s.add(cVar2);
                } else if (!p2 && this.f121404n) {
                    this.f121408r.add(cVar2);
                    this.f121407q.add(cVar2);
                }
            }
            if (this.f121404n) {
                if (this.f121408r.size() <= this.f121403j) {
                    z2 = true;
                }
                this.f121388F = z2;
            }
            mo69992h(z);
        }

        /* renamed from: k */
        public final SpannableString mo69995k(Context context, Spannable spannable, int i) {
            SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, spannable, i);
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class);
            if (foregroundColorSpanArr != null) {
                for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                    op02.setSpan(foregroundColorSpan, spannable.getSpanStart(foregroundColorSpan), spannable.getSpanEnd(foregroundColorSpan), spannable.getSpanFlags(foregroundColorSpan));
                }
            }
            return op02;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
            r0 = r0.f127055a.f127080a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r6, int r7, java.lang.String r8, ob0.C117747y r9) {
            /*
                r5 = this;
                boolean r8 = r5.f121404n
                if (r8 == 0) goto L_0x0119
                int r8 = r9.getType()
                r0 = 1364(0x554, float:1.911E-42)
                if (r8 != r0) goto L_0x0119
                boolean r8 = r9 instanceof sb0.C48358l
                if (r8 == 0) goto L_0x0119
                r8 = 0
                r5.f121389G = r8
                sb0.l r9 = (sb0.C48358l) r9
                ob0.c r0 = r9.f129461e
                r1 = 0
                if (r0 == 0) goto L_0x0023
                ob0.c$c r0 = r0.f127055a
                pe3.a r0 = r0.f127080a
                if (r0 == 0) goto L_0x0023
                te3.cf r0 = (te3.C48994cf) r0
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                java.lang.String r2 = r0.f131686e
                java.lang.String r3 = r0.f131685d
                java.lang.String r4 = r5.f121400g
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L_0x0119
                java.lang.String r4 = r5.f121397d
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0119
                int r3 = r5.f121396N
                int r0 = r0.f131687f
                if (r3 == r0) goto L_0x0040
                goto L_0x0119
            L_0x0040:
                r0 = 1
                if (r6 != 0) goto L_0x010c
                if (r7 == 0) goto L_0x0047
                goto L_0x010c
            L_0x0047:
                ob0.c r6 = r9.f129461e
                if (r6 == 0) goto L_0x0054
                ob0.c$d r6 = r6.f127056b
                pe3.a r6 = r6.f127083a
                if (r6 == 0) goto L_0x0054
                r1 = r6
                te3.df r1 = (te3.C49136df) r1
            L_0x0054:
                if (r1 == 0) goto L_0x00fe
                te3.am3 r6 = r1.f132276d
                if (r6 == 0) goto L_0x00fe
                int r6 = r6.f130638d
                if (r6 == 0) goto L_0x0060
                goto L_0x00fe
            L_0x0060:
                java.util.LinkedList<te3.bf> r6 = r1.f132277e
                boolean r7 = r1.f132278f
                java.lang.String r9 = r5.f121400g
                boolean r9 = r2.equals(r9)
                if (r9 != 0) goto L_0x006e
                goto L_0x0119
            L_0x006e:
                r5.f121388F = r8
                int r9 = r5.f121396N
                int r1 = r6.size()
                int r9 = r9 + r1
                r5.f121396N = r9
                boolean r9 = r5.mo69983d()
                if (r9 == 0) goto L_0x00a5
                java.util.ArrayList<java.lang.Object> r9 = r5.f121408r
                int r9 = r9.size()
                java.util.ArrayList<sb0.c> r1 = r5.f121407q
                int r1 = r1.size()
                if (r9 >= r1) goto L_0x0092
                r5.mo69994j(r2, r0)
                goto L_0x0119
            L_0x0092:
                java.util.ArrayList<java.lang.Object> r9 = r5.f121408r
                int r9 = r9.size()
                java.util.ArrayList<sb0.c> r1 = r5.f121407q
                int r1 = r1.size()
                if (r9 <= r1) goto L_0x00a5
                r5.mo69992h(r0)
                goto L_0x0119
            L_0x00a5:
                boolean r9 = r5.mo69984f()
                if (r9 == 0) goto L_0x00ad
                r5.f121387E = r7
            L_0x00ad:
                int r7 = r5.f121399f
                r9 = 3
                if (r7 != r9) goto L_0x00b4
                r7 = 1
                goto L_0x00b5
            L_0x00b4:
                r7 = 0
            L_0x00b5:
                if (r7 == 0) goto L_0x00b8
                goto L_0x0119
            L_0x00b8:
                java.util.Iterator r6 = r6.iterator()
            L_0x00bc:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x00fa
                java.lang.Object r7 = r6.next()
                te3.bf r7 = (te3.C48848bf) r7
                te3.ef r9 = r7.f131073d
                java.lang.String r1 = r9.f132889d
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x00d3
                goto L_0x00bc
            L_0x00d3:
                java.util.ArrayList<sb0.c> r1 = r5.f121407q
                java.util.Iterator r1 = r1.iterator()
            L_0x00d9:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00f1
                java.lang.Object r2 = r1.next()
                sb0.c r2 = (sb0.C48334c) r2
                java.lang.String r3 = r9.f132889d
                java.lang.String r2 = r2.field_bizChatServId
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x00d9
                r9 = 1
                goto L_0x00f2
            L_0x00f1:
                r9 = 0
            L_0x00f2:
                if (r9 != 0) goto L_0x00bc
                java.util.ArrayList<java.lang.Object> r9 = r5.f121408r
                r9.add(r7)
                goto L_0x00bc
            L_0x00fa:
                r5.mo69992h(r0)
                goto L_0x0119
            L_0x00fe:
                boolean r6 = r5.mo69984f()
                if (r6 == 0) goto L_0x010b
                r5.f121388F = r8
                r5.f121395M = r0
                r5.mo69985g()
            L_0x010b:
                return
            L_0x010c:
                boolean r6 = r5.mo69984f()
                if (r6 == 0) goto L_0x0119
                r5.f121388F = r8
                r5.f121395M = r0
                r5.mo69985g()
            L_0x0119:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI.C44737c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$d */
    public static class C44739d {

        /* renamed from: a */
        public View f121417a;

        /* renamed from: b */
        public TextView f121418b;

        /* renamed from: c */
        public View f121419c;
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$e */
    public static class C44740e {

        /* renamed from: a */
        public View f121420a;

        /* renamed from: b */
        public View f121421b;

        /* renamed from: c */
        public View f121422c;

        public C44740e(C44735a aVar) {
        }

        /* renamed from: a */
        public final void mo69997a(boolean z, boolean z2, boolean z3) {
            View view = this.f121420a;
            int i = 8;
            int i2 = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f121421b;
            int i3 = z2 ? 0 : 8;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Integer.valueOf(i3));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f121422c;
            if (z3) {
                i = 0;
            }
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$f */
    public static class C44741f {

        /* renamed from: a */
        public View f121423a;

        /* renamed from: b */
        public TextView f121424b;
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$g */
    public static class C44742g {

        /* renamed from: a */
        public View f121425a;

        /* renamed from: b */
        public TextView f121426b;

        /* renamed from: c */
        public ImageView f121427c;
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$h */
    public static class C44743h {

        /* renamed from: a */
        public View f121428a;

        /* renamed from: b */
        public ImageView f121429b;

        /* renamed from: c */
        public TextView f121430c;

        /* renamed from: d */
        public TextView f121431d;
    }

    /* renamed from: H1 */
    public void mo63485H1(boolean z, String[] strArr, long j, int i) {
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        finish();
    }

    /* renamed from: H7 */
    public final void mo69976H7(C52558c cVar, int i) {
        C47969h jo = C48009v0.Ex0().mo72749jo(this.f121370e);
        long j = 0;
        long j2 = jo != null ? jo.field_wwCorpId : 0;
        if (jo != null) {
            j = jo.field_wwUserVid;
        }
        long o2 = cVar.mo73497o2();
        C115669n.INSTANCE.mo160131h(14507, Long.valueOf(j2), Long.valueOf(o2), Long.valueOf(j), 2, 2, Integer.valueOf(i));
        Log.m105919d("MicroMsg.BizChatSearchUI", "enter biz enterprise sub barnd report: %s,%s,%s,%s,%s,%s", Long.valueOf(j2), Long.valueOf(o2), Long.valueOf(j), 1, 2, Integer.valueOf(i));
    }

    /* renamed from: I7 */
    public void mo69977I7(int i) {
        C44740e eVar = this.f121373h;
        if (eVar == null) {
            return;
        }
        if (i == 1) {
            eVar.mo69997a(true, false, false);
        } else if (i != 2) {
            eVar.mo69997a(false, false, false);
        } else {
            eVar.mo69997a(false, false, true);
        }
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        hideVKB();
        return true;
    }

    /* renamed from: T3 */
    public void mo63486T3() {
        hideVKB();
    }

    /* renamed from: U1 */
    public void mo63487U1() {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3r;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    public void initView() {
        if (Util.isNullOrNil(this.f121369d)) {
            this.f121369d = getIntent().getStringExtra("enterprise_biz_name");
            this.f121370e = getIntent().getStringExtra("enterprise_biz_father_name");
            this.f121371f = getIntent().getIntExtra("biz_chat_search_scene", 1);
            this.f121372g = getIntent().getStringExtra("biz_chat_search_text");
            if (Util.isNullOrNil(this.f121369d)) {
                finish();
            }
        }
        this.f121375j = (BizChatSearchListView) findViewById(C0966R.C0970id.afc);
        this.f121376n = (TextView) findViewById(C0966R.C0970id.hgr);
        C44737c cVar = new C44737c(getContext(), this.f121369d, this.f121370e, this.f121371f);
        this.f121377o = cVar;
        if (cVar.mo69984f()) {
            C44740e eVar = new C44740e((C44735a) null);
            this.f121373h = eVar;
            BizChatSearchListView bizChatSearchListView = this.f121375j;
            View inflate = View.inflate(getContext(), C0966R.C0971layout.b7z, (ViewGroup) null);
            eVar.f121420a = inflate.findViewById(C0966R.C0970id.g3j);
            eVar.f121421b = inflate.findViewById(C0966R.C0970id.g39);
            eVar.f121422c = inflate.findViewById(C0966R.C0970id.g3o);
            View view = eVar.f121420a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = eVar.f121421b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = eVar.f121422c;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bizChatSearchListView.addFooterView(inflate);
            mo69977I7(0);
        }
        this.f121375j.setAdapter(this.f121377o);
        this.f121375j.setOnItemClickListener(new C44736b());
        this.f121375j.setOnTouchListener(this);
        if (this.f121377o.mo69984f()) {
            this.f121375j.setOnScrollListener(this.f121378p);
        }
        C114760b bVar = new C114760b();
        this.f121374i = bVar;
        bVar.mo153851c(this.f121377o.mo69983d());
        C114760b bVar2 = this.f121374i;
        bVar2.f344100u = this;
        bVar2.f319122j = this;
        bVar2.f344097r = false;
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        String str2;
        boolean z = true;
        if (!Util.isNullOrNil(str) || (str2 = this.f121372g) == null) {
            C44737c cVar = this.f121377o;
            cVar.f121400g = str;
            if (Util.isNullOrNil(str)) {
                cVar.mo69981a();
                cVar.f121388F = false;
                cVar.f121395M = false;
                cVar.mo69992h(true);
                return;
            }
            if (cVar.f121399f == 4) {
                cVar.mo69981a();
                cVar.f121388F = false;
                cVar.f121395M = false;
                cVar.mo69993i(str);
            } else if (cVar.mo69984f()) {
                cVar.f121388F = true;
                cVar.f121395M = false;
                cVar.mo69985g();
                cVar.mo69994j(str, false);
                if (cVar.f121404n) {
                    MMHandlerThread.postToMainThreadDelayed(new C44764n(cVar, str), 200);
                }
            } else {
                cVar.mo69994j(str, true);
                boolean z2 = cVar.f121404n;
                if (z2 && cVar.f121388F && z2) {
                    MMHandlerThread.postToMainThreadDelayed(new C44764n(cVar, str), 200);
                }
                if (cVar.f121406p) {
                    cVar.mo69993i(str);
                }
            }
        } else {
            String str3 = null;
            this.f121372g = null;
            if (!str2.equals("")) {
                this.f121374i.mo23884r(str2);
            }
            C114760b bVar = this.f121374i;
            C44737c cVar2 = this.f121377o;
            int i = C44737c.f121382P;
            if (cVar2.mo69983d()) {
                str3 = getContext().getResources().getString(C0966R.string.ars);
            } else if (this.f121377o.mo69984f()) {
                str3 = getContext().getResources().getString(C0966R.string.arx);
            } else {
                if (this.f121377o.f121399f != 3) {
                    z = false;
                }
                if (z) {
                    str3 = getContext().getResources().getString(C0966R.string.arp);
                }
            }
            bVar.mo153859q(str3);
            this.f121374i.mo153849a();
        }
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f121374i.mo23882j(this, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f121374i.mo174407s();
        this.f121374i.mo153849a();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f121374i.mo153858m(this, menu);
        return true;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSearchUI$i */
    public static class C44744i {

        /* renamed from: a */
        public int f121432a;

        /* renamed from: b */
        public Object f121433b;

        public C44744i() {
            this.f121432a = 0;
            this.f121433b = null;
        }

        public C44744i(int i, Object obj) {
            this.f121432a = i;
            this.f121433b = obj;
        }
    }
}
