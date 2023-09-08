package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.p136ui.contact.LabelContainerView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import i61.C76300m;
import j20.C117292a;
import j61.C33520k;
import j61.C33521l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import p910lj.C76701a;
import r61.C101358h;
import te3.C101800k70;
import te3.C49978jd3;
import te3.C50791p70;
import te3.C51755vy1;
import te3.C52325zy1;
import u61.C101964h;
import yl0.C91481e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI */
public class EmojiStoreV2SingleProductUI extends MMActivity implements C11385n, AbsListView.OnScrollListener {

    /* renamed from: U */
    public static final /* synthetic */ int f268885U = 0;

    /* renamed from: A */
    public View f268886A;

    /* renamed from: B */
    public boolean f268887B = true;

    /* renamed from: C */
    public ProgressDialog f268888C;

    /* renamed from: D */
    public C51755vy1 f268889D;

    /* renamed from: E */
    public byte[] f268890E;

    /* renamed from: F */
    public int f268891F = -1;

    /* renamed from: G */
    public boolean f268892G = false;

    /* renamed from: H */
    public String f268893H;

    /* renamed from: I */
    public LabelContainerView f268894I;

    /* renamed from: J */
    public MMTagPanel f268895J;

    /* renamed from: K */
    public HashMap<String, Integer> f268896K = new HashMap<>();

    /* renamed from: L */
    public ArrayList<String> f268897L;

    /* renamed from: M */
    public C33521l f268898M;

    /* renamed from: N */
    public boolean f268899N = false;

    /* renamed from: P */
    public boolean f268900P = false;

    /* renamed from: Q */
    public MMHandler f268901Q = new EmojiStoreV2SingleProductUI$$c(this);

    /* renamed from: R */
    public IListener f268902R = new IListener<EmojiSyncTaskEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1273581380;
        }

        public boolean callback(IEvent iEvent) {
            MMHandler mMHandler;
            EmojiSyncTaskEvent emojiSyncTaskEvent = (EmojiSyncTaskEvent) iEvent;
            EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = EmojiStoreV2SingleProductUI.this;
            if (emojiStoreV2SingleProductUI.f268921w == null || (mMHandler = emojiStoreV2SingleProductUI.f268901Q) == null) {
                return false;
            }
            mMHandler.post(new C93253v(this));
            return false;
        }
    };

    /* renamed from: S */
    public MMPullDownView.C73179f f268903S = new EmojiStoreV2SingleProductUI$$d(this);

    /* renamed from: T */
    public MMPullDownView.C73177d f268904T = new EmojiStoreV2SingleProductUI$$e(this);

    /* renamed from: d */
    public int f268905d = 0;

    /* renamed from: e */
    public String f268906e;

    /* renamed from: f */
    public int f268907f;

    /* renamed from: g */
    public String f268908g;

    /* renamed from: h */
    public String f268909h;

    /* renamed from: i */
    public int f268910i = -1;

    /* renamed from: j */
    public String f268911j;

    /* renamed from: n */
    public String f268912n;

    /* renamed from: o */
    public String f268913o;

    /* renamed from: p */
    public String f268914p;

    /* renamed from: q */
    public String f268915q;

    /* renamed from: r */
    public int f268916r = 0;

    /* renamed from: s */
    public int f268917s;

    /* renamed from: t */
    public long f268918t;

    /* renamed from: u */
    public PreViewListGridView f268919u;

    /* renamed from: v */
    public MMPullDownView f268920v;

    /* renamed from: w */
    public C93246d0 f268921w;

    /* renamed from: x */
    public View f268922x;

    /* renamed from: y */
    public View f268923y;

    /* renamed from: z */
    public TextView f268924z;

    /* renamed from: H7 */
    public static void m117711H7(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI, C101800k70 k702) {
        emojiStoreV2SingleProductUI.getClass();
        EmojiInfo h = C101964h.m134226h(k702);
        AppCompatActivity context = emojiStoreV2SingleProductUI.getContext();
        int i = emojiStoreV2SingleProductUI.f268917s;
        long j = emojiStoreV2SingleProductUI.f268918t;
        C87412m.m108594g(context, "context");
        C101358h hVar = new C101358h(context, h, false);
        hVar.f296925x = 5;
        hVar.f296923v = j;
        hVar.f296922u = i;
        hVar.f296924w = 29;
        hVar.f296921t = "";
        hVar.f296919r = null;
        hVar.f296920s = null;
        hVar.f296911g.mo140655A();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: te3.vy1} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        if (r3 != null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0107, code lost:
        if (r3 != null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        r3.close();
        r2 = r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0156  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127857I7() {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = r1.f268899N
            java.lang.String r2 = "MicroMsg.emoji.EmojiStoreV2SingleProductUI"
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "need jeep to update page."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x000f:
            boolean r0 = r1.f268900P
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "need jeep to enter V3 SingleProductPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x001a:
            r2 = 0
            r1.f268890E = r2
            int r0 = r1.f268916r
            r3 = 1001(0x3e9, float:1.403E-42)
            r4 = 12875(0x324b, float:1.8042E-41)
            java.lang.String r5 = ""
            r6 = 2
            r7 = 1
            r8 = 0
            switch(r0) {
                case 1: goto L_0x0098;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0063;
                case 5: goto L_0x0049;
                case 6: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x015a
        L_0x002d:
            r1.f268893H = r5
            r1.showOptionMenu(r3, r8)
            r0 = 1002(0x3ea, float:1.404E-42)
            r1.showOptionMenu(r0, r7)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r8] = r3
            r2[r7] = r5
            r0.mo160131h(r4, r2)
            goto L_0x015a
        L_0x0049:
            r1.f268893H = r5
            java.lang.String r0 = r1.f268909h
            r1.mo127862N7(r0)
            r1.f268887B = r8
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2[r8] = r3
            r2[r7] = r5
            r0.mo160131h(r4, r2)
            goto L_0x015a
        L_0x0063:
            r1.showOptionMenu(r3, r8)
            java.lang.String r0 = r1.f268908g
            r1.f268893H = r0
            r1.mo127862N7(r0)
            r1.f268887B = r8
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2[r8] = r3
            r2[r7] = r5
            r0.mo160131h(r4, r2)
            goto L_0x015a
        L_0x0080:
            r1.showOptionMenu(r3, r8)
            r1.f268887B = r8
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2[r8] = r3
            java.lang.String r3 = r1.f268906e
            r2[r7] = r3
            r0.mo160131h(r4, r2)
            goto L_0x015a
        L_0x0098:
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.m r0 = r0.mo57718e()
            r0.getClass()
            java.lang.String r3 = "0"
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r9 = "MicroMsg.emoji.EmotionDesignerInfo"
            if (r3 == 0) goto L_0x00be
            java.lang.String r0 = "getDesignerEmojiListResponseByUIN failed. Designer UIN is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x010c
        L_0x00be:
            java.lang.String r3 = "content"
            java.lang.String[] r12 = new java.lang.String[]{r3}
            java.lang.String r13 = "designerIDAndType=? "
            java.lang.String r3 = "02"
            java.lang.String[] r14 = new java.lang.String[]{r3}
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r0.f100783d     // Catch:{ IOException -> 0x00f8, all -> 0x00f6 }
            java.lang.String r11 = "EmotionDesignerInfo"
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 2
            android.database.Cursor r3 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x00f8, all -> 0x00f6 }
            if (r3 == 0) goto L_0x00f3
            boolean r0 = r3.moveToFirst()     // Catch:{ IOException -> 0x00f1 }
            if (r0 == 0) goto L_0x00f3
            te3.vy1 r0 = new te3.vy1     // Catch:{ IOException -> 0x00f1 }
            r0.<init>()     // Catch:{ IOException -> 0x00f1 }
            byte[] r10 = r3.getBlob(r8)     // Catch:{ IOException -> 0x00f1 }
            r0.parseFrom(r10)     // Catch:{ IOException -> 0x00f1 }
            r2 = r0
            goto L_0x00f3
        L_0x00f1:
            r0 = move-exception
            goto L_0x00fa
        L_0x00f3:
            if (r3 == 0) goto L_0x010c
            goto L_0x0109
        L_0x00f6:
            r0 = move-exception
            goto L_0x0154
        L_0x00f8:
            r0 = move-exception
            r3 = r2
        L_0x00fa:
            java.lang.String r10 = "exception:%s"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0152 }
            r11[r8] = r0     // Catch:{ all -> 0x0152 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r10, r11)     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x010c
        L_0x0109:
            r3.close()
        L_0x010c:
            r1.f268889D = r2
            if (r2 == 0) goto L_0x0136
            java.util.LinkedList<te3.k70> r0 = r2.f143767d
            if (r0 == 0) goto L_0x0136
            com.tencent.mm.plugin.emoji.ui.v2.d0 r0 = r1.f268921w
            if (r0 == 0) goto L_0x0136
            r1.mo127861M7(r2)
            com.tencent.mm.plugin.emoji.ui.v2.d0 r0 = r1.f268921w
            te3.vy1 r2 = r1.f268889D
            java.util.LinkedList<te3.k70> r2 = r2.f143767d
            java.util.List<te3.k70> r3 = r0.f268953f
            if (r3 != 0) goto L_0x012d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f268953f = r3
            goto L_0x0130
        L_0x012d:
            r3.clear()
        L_0x0130:
            r0.f268953f = r2
            r0.notifyDataSetChanged()
            goto L_0x0140
        L_0x0136:
            r0 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r0 = r1.getString(r0)
            r1.mo127859K7(r0)
        L_0x0140:
            r1.f268887B = r7
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r8] = r3
            r2[r7] = r5
            r0.mo160131h(r4, r2)
            goto L_0x015a
        L_0x0152:
            r0 = move-exception
            r2 = r3
        L_0x0154:
            if (r2 == 0) goto L_0x0159
            r2.close()
        L_0x0159:
            throw r0
        L_0x015a:
            byte[] r0 = r1.f268890E
            r1.mo127858J7(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2SingleProductUI.mo127857I7():void");
    }

    /* renamed from: J7 */
    public final void mo127858J7(byte[] bArr) {
        this.f268890E = null;
        switch (this.f268916r) {
            case 1:
                C86709a0.m107529k().f251779b.mo123460f(new C33520k(1, this.f268905d, this.f268907f, this.f268909h, this.f268910i, bArr));
                return;
            case 2:
            case 3:
                C86709a0.m107529k().f251779b.mo123460f(new C33520k(2, this.f268905d, this.f268907f, this.f268909h, this.f268910i, bArr));
                return;
            case 4:
                C86709a0.m107529k().f251779b.mo123460f(new C33520k(3, this.f268905d, this.f268907f, this.f268909h, this.f268910i, bArr));
                return;
            case 5:
                C86709a0.m107529k().f251779b.mo123460f(new C33520k(4, this.f268905d, this.f268907f, this.f268909h, this.f268910i, bArr));
                return;
            case 6:
                C86709a0.m107529k().f251779b.mo123460f(new C33520k(5, this.f268905d, this.f268907f, this.f268909h, this.f268910i, bArr));
                return;
            default:
                return;
        }
    }

    /* renamed from: K7 */
    public final void mo127859K7(String str) {
        if (isFinishing()) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[showLoadingDialog] acitivity is finished.");
            return;
        }
        this.f268888C = C76879j.m92723Q(this, getString(C0966R.string.a3h), str, true, true, new EmojiStoreV2SingleProductUI$$b(this));
    }

    /* renamed from: L7 */
    public final void mo127860L7(LinkedList<C101800k70> linkedList) {
        C93246d0 d0Var = this.f268921w;
        if (d0Var != null && linkedList != null) {
            if (this.f268891F == -1) {
                List<C101800k70> list = d0Var.f268953f;
                if (list == null) {
                    d0Var.f268953f = new ArrayList();
                } else {
                    list.clear();
                }
                d0Var.f268953f = linkedList;
                d0Var.notifyDataSetChanged();
                return;
            }
            if (d0Var.f268953f == null) {
                d0Var.f268953f = new ArrayList();
            }
            d0Var.f268953f.addAll(linkedList);
            d0Var.notifyDataSetChanged();
        }
    }

    /* renamed from: M7 */
    public final void mo127861M7(C51755vy1 vy12) {
        LinkedList<C50791p70> linkedList;
        if (vy12 == null || (linkedList = vy12.f143769f) == null || linkedList.size() <= 0) {
            showOptionMenu(1001, false);
            return;
        }
        showOptionMenu(1001, this.f268887B);
        if (this.f268895J != null) {
            ArrayList<String> arrayList = this.f268897L;
            if (arrayList == null) {
                this.f268897L = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            if (this.f268896K == null) {
                this.f268896K = new HashMap<>();
            }
            this.f268896K.clear();
            this.f268897L.add(getString(C0966R.string.c_1));
            Iterator<C50791p70> it = vy12.f143769f.iterator();
            while (it.hasNext()) {
                C50791p70 next = it.next();
                if (next != null && !Util.isNullOrNil(next.f139615e)) {
                    this.f268897L.add(next.f139615e);
                    this.f268896K.put(next.f139615e, Integer.valueOf(next.f139614d));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f268893H);
            this.f268895J.mo95190q(arrayList2, this.f268897L);
        }
    }

    /* renamed from: N7 */
    public final void mo127862N7(String str) {
        if (this.f268923y != null && this.f268924z != null) {
            int i = this.f268916r;
            if (i != 4) {
                if (i == 5 && !Util.isNullOrNil(str)) {
                    this.f268924z.setText(getString(C0966R.string.c9x, new Object[]{str}));
                    this.f268924z.setVisibility(0);
                    View view = this.f268923y;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (!Util.isNullOrNil(str)) {
                this.f268924z.setText(getString(C0966R.string.c_2, new Object[]{str}));
                this.f268924z.setVisibility(0);
                View view3 = this.f268923y;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (Util.isNullOrNil(str)) {
                this.f268924z.setText("");
                this.f268924z.setVisibility(8);
                View view5 = this.f268923y;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "updateTagTip", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a36;
    }

    public void initView() {
        if (this.f268916r != 6 || Util.isNullOrNil(this.f268911j)) {
            setMMTitle((int) C0966R.string.c98);
        } else {
            setMMTitle(this.f268911j);
        }
        setBackBtn(new EmojiStoreV2SingleProductUI$$f(this));
        C93246d0 d0Var = new C93246d0(getContext(), 3);
        this.f268921w = d0Var;
        d0Var.f268959o = new EmojiStoreV2SingleProductUI$$g(this);
        this.f268919u = (PreViewListGridView) findViewById(C0966R.C0970id.foz);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a2u, (ViewGroup) null);
        this.f268922x = inflate;
        this.f268923y = inflate.findViewById(C0966R.C0970id.cg4);
        this.f268924z = (TextView) this.f268922x.findViewById(C0966R.C0970id.ci7);
        this.f268919u.addHeaderView(this.f268922x);
        View inflate2 = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a2i, (ViewGroup) null);
        this.f268886A = inflate2;
        this.f268919u.addFooterView(inflate2);
        View view = this.f268886A;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f268919u.setAdapter((ListAdapter) this.f268921w);
        this.f268919u.setOnScrollListener(this);
        MMPullDownView mMPullDownView = (MMPullDownView) findViewById(C0966R.C0970id.g2w);
        this.f268920v = mMPullDownView;
        mMPullDownView.setTopViewVisible(false);
        this.f268920v.setOnBottomLoadDataListener(this.f268903S);
        this.f268920v.setAtBottomCallBack(this.f268904T);
        this.f268920v.setBottomViewVisible(false);
        this.f268920v.setIsBottomShowAll(false);
        this.f268920v.setIsReturnSuperDispatchWhenCancel(true);
        LabelContainerView labelContainerView = (LabelContainerView) findViewById(C0966R.C0970id.j9l);
        this.f268894I = labelContainerView;
        ((TextView) labelContainerView.findViewById(16908310)).setText(C0966R.string.g2f);
        MMTagPanel mMTagPanel = (MMTagPanel) this.f268894I.findViewById(C0966R.C0970id.bp_);
        this.f268895J = mMTagPanel;
        mMTagPanel.setTagSelectedBG(C0966R.C0969drawable.f357373aw1);
        this.f268895J.setTagSelectedTextColorRes(C0966R.color.akw);
        this.f268893H = getString(C0966R.string.c_1);
        this.f268894I.setOnLabelContainerListener(new C93254w(this));
        this.f268895J.setCallBack(new C93255x(this));
        addIconOptionMenu(1001, C0966R.C0969drawable.bst, new C93256y(this));
        addIconOptionMenu(1002, C0966R.raw.icons_outlined_share, new C2221s(this));
        showOptionMenu(1001, false);
        showOptionMenu(1002, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 0) {
            if (i != 2002) {
                if (i == 5001 && i2 == -1) {
                    C75026b.m89951a(this, getContext().getString(C0966R.string.a2x));
                }
            } else if (i2 == -1) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!Util.isNullOrNil(stringExtra)) {
                    Log.m105918d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", ".." + stringExtra);
                    C76300m.m91727c(this, stringExtra, 27, this.f268910i, this.f268911j, this.f268913o, this.f268912n, this.f268914p, this.f268916r);
                }
            }
        } else if (i2 == -1) {
            C75026b.m89951a(this, getContext().getString(C0966R.string.a2x));
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        LabelContainerView labelContainerView = this.f268894I;
        if (labelContainerView == null || labelContainerView.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        this.f268894I.setVisibility(8);
        showOptionMenu(1001, this.f268887B);
        setMMTitle((int) C0966R.string.c98);
    }

    public void onCreate(Bundle bundle) {
        C49978jd3 jd32;
        Class cls = C92054g.class;
        super.onCreate(bundle);
        boolean z = false;
        this.f268905d = getIntent().getIntExtra("uin", 0);
        getIntent().getStringExtra("Select_Conv_User");
        this.f268918t = getIntent().getLongExtra("searchID", 0);
        this.f268906e = getIntent().getStringExtra("id");
        String stringExtra = getIntent().getStringExtra("tag_id");
        if (!Util.isNullOrNil(stringExtra)) {
            try {
                this.f268907f = Integer.valueOf(stringExtra).intValue();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", Util.stackTraceToString(e));
            }
        }
        this.f268908g = getIntent().getStringExtra("tag_desc");
        this.f268909h = getIntent().getStringExtra("keyword");
        this.f268910i = getIntent().getIntExtra("set_id", 0);
        this.f268911j = getIntent().getStringExtra("set_title");
        this.f268912n = getIntent().getStringExtra("set_iconURL");
        this.f268913o = getIntent().getStringExtra("set_desc");
        this.f268914p = getIntent().getStringExtra("headurl");
        this.f268915q = getIntent().getStringExtra("sns_object_data");
        this.f268916r = getIntent().getIntExtra("pageType", 0);
        if (!Util.isNullOrNil(this.f268915q)) {
            this.f268910i = EmojiLogic.m117479j(this.f268915q);
            this.f268911j = EmojiLogic.m117480k(this.f268915q);
            this.f268912n = EmojiLogic.m117477h(this.f268915q);
            this.f268913o = EmojiLogic.m117476g(this.f268915q);
            this.f268914p = EmojiLogic.m117478i(this.f268915q);
            this.f268916r = EmojiLogic.m117481l(this.f268915q);
        }
        switch (this.f268916r) {
            case 0:
                if (Util.isNullOrNil(this.f268909h)) {
                    if (Util.isNullOrNil(this.f268906e)) {
                        if (this.f268905d == 0) {
                            if (this.f268907f == 0) {
                                if (this.f268910i <= 0) {
                                    this.f268916r = 1;
                                    this.f268917s = 0;
                                    break;
                                } else {
                                    this.f268916r = 6;
                                    this.f268917s = 4;
                                    break;
                                }
                            } else {
                                this.f268917s = 3;
                                this.f268916r = 4;
                                break;
                            }
                        } else {
                            this.f268916r = 3;
                            this.f268917s = 1;
                            break;
                        }
                    } else {
                        this.f268916r = 2;
                        this.f268917s = 1;
                        break;
                    }
                } else {
                    this.f268916r = 5;
                    this.f268887B = false;
                    this.f268917s = 2;
                    break;
                }
            case 1:
                this.f268917s = 0;
                break;
            case 2:
                if (Util.isNullOrNil(this.f268906e)) {
                    this.f268899N = true;
                    break;
                }
                break;
            case 3:
                if (this.f268905d == 0) {
                    this.f268899N = true;
                    break;
                }
                break;
            case 4:
                if (this.f268907f == 0) {
                    this.f268899N = true;
                    break;
                }
                break;
            case 5:
                if (Util.isNullOrNil(this.f268909h)) {
                    this.f268899N = true;
                    break;
                }
                break;
            case 6:
                if (this.f268910i == 0) {
                    this.f268899N = true;
                }
                this.f268900P = true;
                break;
            default:
                this.f268899N = true;
                break;
        }
        if (this.f268899N) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", ((C92054g) C86312j.m106911c(cls)).xx0().mo138005L());
            intent.putExtra("showShare", false);
            C88144b.m109791i(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            finish();
        }
        if (this.f268900P) {
            int i = this.f268910i;
            String str = this.f268911j;
            String str2 = this.f268913o;
            String str3 = this.f268912n;
            String str4 = this.f268914p;
            Intent intent2 = new Intent();
            intent2.setClass(this, EmojiStoreV3SingleProductAlbumUI.class);
            intent2.putExtra("set_id", i);
            intent2.putExtra("set_title", str);
            intent2.putExtra("set_desc", str2);
            intent2.putExtra("set_iconURL", str3);
            intent2.putExtra("headurl", str4);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C119157j) C119157j.f356862d).mo183895z(new EmojiStoreV2SingleProductUI$$a(this));
        }
        initView();
        if (this.f268905d == 0 && this.f268916r == 2) {
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C52325zy1 jo = C30790w2.m39221h().mo57718e().mo61536jo(this.f268906e);
            if (jo == null || (jd32 = jo.f146279d) == null || jd32.f136019d == 0 || Util.isNullOrNil(jd32.f136020e)) {
                z = true;
            } else {
                int i2 = jo.f146279d.f136019d;
                this.f268905d = i2;
                Log.m105925i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "uin:%s ", Integer.valueOf(i2));
            }
        }
        if (!z) {
            mo127857I7();
        } else {
            this.f268898M = new C33521l(this.f268906e);
            C86709a0.m107529k().f251779b.mo123460f(this.f268898M);
            mo127859K7(getString(C0966R.string.a4d));
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, Boolean.FALSE);
        C86709a0.m107529k().f251779b.mo123455a(C91481e.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, this);
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, this);
        C86709a0.m107529k().f251779b.mo123470p(C91481e.CTRL_INDEX, this);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f268902R.dead();
    }

    public void onResume() {
        super.onResume();
        this.f268902R.alive();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49978jd3 jd32;
        byte[] bArr;
        int i3 = i;
        int i4 = i2;
        int type = yVar.getType();
        if (type == 821) {
            ProgressDialog progressDialog = this.f268888C;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f268888C.dismiss();
            }
            C33520k kVar = (C33520k) yVar;
            C51755vy1 j1 = kVar.mo59184j1();
            this.f268892G = false;
            View view = this.f268886A;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f268901Q.removeMessages(1002);
                this.f268901Q.sendEmptyMessageDelayed(1001, 200);
            }
            int i5 = kVar.f90753f;
            if (((i3 == 0 && i4 == 0) || (i3 == 4 && (i4 == 2 || i4 == 3))) && (((bArr = this.f268890E) == null || bArr.length <= 0) && i5 != 3)) {
                mo127861M7(j1);
            }
            if (i3 == 0 || i3 == 4) {
                this.f268890E = kVar.f90755h;
                if (i4 == 0) {
                    mo127860L7(j1.f143767d);
                    this.f268891F = 0;
                } else if (i4 == 2) {
                    mo127860L7(j1.f143767d);
                    this.f268891F = 2;
                } else if (i4 == 3) {
                    this.f268891F = -1;
                    mo127860L7(j1.f143767d);
                } else {
                    C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.c_z), 0).show();
                }
            } else {
                C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.c_z), 0).show();
            }
        } else if (type == 239) {
            ProgressDialog progressDialog2 = this.f268888C;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f268888C.dismiss();
            }
            if (i4 == 0 && i3 == 0) {
                C52325zy1 j15 = ((C33521l) yVar).mo59185j1();
                if (j15 != null && (jd32 = j15.f146279d) != null) {
                    this.f268905d = jd32.f136019d;
                    MMHandler mMHandler = this.f268901Q;
                    if (mMHandler != null) {
                        mMHandler.sendEmptyMessage(1004);
                        return;
                    }
                    return;
                }
                return;
            }
            showOptionMenu(1001, false);
            C76879j.m92712F(getContext(), getString(C0966R.string.c5y), (String) null, true);
            Log.m105920e("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "open single product ui failed.");
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1 && this.f268891F == 2 && !this.f268892G) {
            Log.m105918d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "No More List.");
            if (!this.f268892G) {
                mo127858J7(this.f268890E);
                this.f268892G = true;
                this.f268901Q.sendEmptyMessageDelayed(1002, 200);
            }
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
