package ro3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import ro3.C110588j;

/* renamed from: ro3.g */
public final class C110584g {

    /* renamed from: a */
    public final C110588j f330789a;

    /* renamed from: b */
    public final PopupWindow f330790b;

    /* renamed from: c */
    public int f330791c;

    /* renamed from: d */
    public int f330792d;

    /* renamed from: e */
    public RecyclerView f330793e;

    /* renamed from: f */
    public C110582e f330794f;

    /* renamed from: g */
    public List<C110588j.C110589b> f330795g;

    /* renamed from: h */
    public ImageView f330796h;

    /* renamed from: ro3.g$a */
    public static final class C110585a implements C110588j.C110590c {

        /* renamed from: a */
        public final /* synthetic */ C110584g f330797a;

        public C110585a(C110584g gVar) {
            this.f330797a = gVar;
        }

        /* renamed from: a */
        public void mo14785a(List<C110588j.C110589b> list, int i) {
            C87412m.m108594g(list, "items");
        }

        /* renamed from: b */
        public void mo14786b(View view, C110588j.C110589b bVar, String str) {
            int length;
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "item");
            C87412m.m108594g(str, "curSelect");
            C110584g gVar = this.f330797a;
            gVar.getClass();
            int i = bVar.f330853b;
            if (i != 1) {
                switch (i) {
                    case 16908319:
                        gVar.f330789a.mo148759l();
                        C110588j jVar = gVar.f330789a;
                        jVar.mo148761n(0, jVar.f330833h.getText().length());
                        C110588j jVar2 = gVar.f330789a;
                        jVar2.f330849x = false;
                        jVar2.f330833h.post(new C110586h(gVar));
                        gVar.f330789a.f330833h.setCursorVisible(false);
                        break;
                    case 16908320:
                        Object systemService = gVar.f330789a.f330832g.getSystemService("clipboard");
                        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        String str2 = gVar.f330789a.f330831f.f330857c;
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str2, str2));
                        gVar.f330789a.getClass();
                        gVar.f330789a.mo148760m();
                        gVar.f330789a.mo148759l();
                        CharSequence text = gVar.f330789a.f330833h.getText();
                        Editable editable = text instanceof Editable ? (Editable) text : null;
                        if (editable != null) {
                            C110588j.C110591d dVar = gVar.f330789a.f330831f;
                            int i2 = dVar.f330855a;
                            int i3 = dVar.f330856b;
                            if (i3 >= i2 && i2 <= (length = editable.length()) && i3 <= length && i2 >= 0 && i3 >= 0) {
                                editable.delete(i2, i3);
                            }
                        }
                        Context context = gVar.f330789a.f330832g;
                        try {
                            Toast.makeText(context, context.getResources().getString(C0966R.string.grl), 0).show();
                        } catch (Throwable th) {
                            C85975v4.m106307d("EditHelper.OperateWindow", th, "show toast err", new Object[0]);
                        }
                        gVar.f330789a.f330833h.setCursorVisible(true);
                        break;
                    case 16908321:
                        Object systemService2 = gVar.f330789a.f330832g.getSystemService("clipboard");
                        C87412m.m108592e(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                        String str3 = gVar.f330789a.f330831f.f330857c;
                        ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(str3, str3));
                        gVar.f330789a.getClass();
                        gVar.f330789a.mo148760m();
                        gVar.f330789a.mo148759l();
                        String str4 = Build.MANUFACTURER;
                        if (!(!TextUtils.isEmpty(str4) && str4.equalsIgnoreCase("samsung")) || Build.VERSION.SDK_INT <= 32) {
                            Context context2 = gVar.f330789a.f330832g;
                            try {
                                Toast.makeText(context2, context2.getResources().getString(C0966R.string.grk), 0).show();
                            } catch (Throwable th4) {
                                C85975v4.m106307d("EditHelper.OperateWindow", th4, "show toast err", new Object[0]);
                            }
                        }
                        gVar.f330789a.f330833h.setCursorVisible(true);
                        Selection.setSelection(gVar.f330789a.f330833h.getEditableText(), gVar.f330789a.f330833h.getSelectionEnd());
                        break;
                    case 16908322:
                        gVar.f330789a.f330833h.onTextContextMenuItem(16908322);
                        gVar.f330789a.f330833h.setCursorVisible(true);
                        C110588j jVar3 = gVar.f330789a;
                        jVar3.f330815P = jVar3.f330833h.getSelectionStart();
                        break;
                    default:
                        gVar.f330789a.f330833h.setCursorVisible(true);
                        break;
                }
            } else {
                gVar.f330789a.mo148759l();
                int selectionStart = gVar.f330789a.f330833h.getSelectionStart();
                if (selectionStart > 0) {
                    gVar.f330789a.mo148761n(selectionStart - 1, selectionStart);
                } else {
                    gVar.f330789a.mo148761n(selectionStart, selectionStart + 1);
                }
                C110588j jVar4 = gVar.f330789a;
                jVar4.f330849x = false;
                jVar4.mo148762o(jVar4.f330827b);
                C110588j jVar5 = gVar.f330789a;
                jVar5.mo148762o(jVar5.f330828c);
                C110588j jVar6 = gVar.f330789a;
                jVar6.mo148763q(jVar6.mo162138h());
                gVar.f330789a.f330833h.setCursorVisible(false);
            }
            if (((HashMap) gVar.f330789a.f330807H).containsKey(Integer.valueOf(bVar.f330853b))) {
                gVar.f330789a.f330833h.onTextContextMenuItem(bVar.f330853b);
                gVar.f330789a.mo148760m();
                gVar.f330789a.mo148759l();
                gVar.f330789a.f330833h.setCursorVisible(true);
            }
            C110588j.C110590c cVar = gVar.f330789a.f330844s;
            if (cVar != null) {
                cVar.mo14786b(view, bVar, str);
            }
        }
    }

    public C110584g(C110588j jVar, Context context) {
        C87412m.m108594g(jVar, "selectableEditTextHelper");
        this.f330789a = jVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b4m, (ViewGroup) null);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f330791c = inflate.getMeasuredWidth();
        this.f330792d = inflate.getMeasuredHeight();
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
        this.f330790b = popupWindow;
        popupWindow.setClippingEnabled(false);
        View findViewById = inflate.findViewById(C0966R.C0970id.ixh);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.rv_list)");
        this.f330793e = (RecyclerView) findViewById;
        this.f330793e.setLayoutManager(new LinearLayoutManager(jVar.f330832g, 0, false));
        LinkedList linkedList = new LinkedList();
        String string = jVar.f330832g.getResources().getString(C0966R.string.f361029gs3);
        C87412m.m108593f(string, "selectableEditTextHelper…ing(R.string.menu_select)");
        linkedList.add(new C110588j.C110589b(string, 1, 4));
        String string2 = jVar.f330832g.getResources().getString(17039373);
        C87412m.m108593f(string2, "selectableEditTextHelper…droid.R.string.selectAll)");
        linkedList.add(new C110588j.C110589b(string2, 16908319, 12));
        String string3 = jVar.f330832g.getResources().getString(17039363);
        C87412m.m108593f(string3, "selectableEditTextHelper…ing(android.R.string.cut)");
        linkedList.add(new C110588j.C110589b(string3, 16908320, 9));
        String string4 = jVar.f330832g.getResources().getString(17039361);
        C87412m.m108593f(string4, "selectableEditTextHelper…ng(android.R.string.copy)");
        linkedList.add(new C110588j.C110589b(string4, 16908321, 9));
        String string5 = jVar.f330832g.getResources().getString(17039371);
        C87412m.m108593f(string5, "selectableEditTextHelper…g(android.R.string.paste)");
        linkedList.add(new C110588j.C110589b(string5, 16908322));
        this.f330795g = linkedList;
        C110582e eVar = new C110582e(linkedList, new C110585a(this), jVar.f330831f);
        this.f330794f = eVar;
        this.f330793e.setAdapter(eVar);
        C0132m mVar = new C0132m(jVar.f330832g, 0);
        mVar.mo128j(new ColorDrawable(jVar.f330832g.getResources().getColor(C0966R.color.a0b)));
        this.f330793e.mo17085h0(mVar);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.bxt);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.cursor_iv)");
        this.f330796h = (ImageView) findViewById2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0330 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x032a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162106a() {
        /*
            r25 = this;
            r1 = r25
            ro3.j r0 = r1.f330789a
            android.widget.TextView r0 = r0.f330833h
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            r3 = 1
            if (r0 <= 0) goto L_0x001f
            ro3.j r4 = r1.f330789a
            ro3.j$d r4 = r4.f330831f
            int r5 = r4.f330855a
            if (r5 != 0) goto L_0x001f
            int r4 = r4.f330856b
            if (r4 != r0) goto L_0x001f
            r4 = 1
            goto L_0x0034
        L_0x001f:
            ro3.j r4 = r1.f330789a
            ro3.j$d r4 = r4.f330831f
            int r5 = r4.f330855a
            int r4 = r4.f330856b
            if (r5 != r4) goto L_0x0030
            if (r0 <= 0) goto L_0x002e
            r0 = 4
            r4 = 4
            goto L_0x0034
        L_0x002e:
            r4 = 2
            goto L_0x0034
        L_0x0030:
            r0 = 8
            r4 = 8
        L_0x0034:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.List<ro3.j$b> r0 = r1.f330795g
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0056
            java.lang.Object r6 = r0.next()
            ro3.j$b r6 = (ro3.C110588j.C110589b) r6
            int r7 = r6.f330853b
            int r7 = r6.f330854c
            r7 = r7 & r4
            if (r7 == 0) goto L_0x003f
            r5.add(r6)
            goto L_0x003f
        L_0x0056:
            ro3.j r6 = r1.f330789a
            java.lang.String r0 = "helper"
            gy3.C87412m.m108594g(r6, r0)
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r0 = r6.f330807H
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            ro3.w r0 = r6.f330810K
            r0.getClass()
            java.lang.String r7 = android.os.Build.BRAND
            java.lang.String r8 = "BRAND"
            gy3.C87412m.m108593f(r7, r8)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r9 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            gy3.C87412m.m108593f(r7, r9)
            java.util.HashMap<java.lang.String, java.util.List<ro3.w$a>> r0 = r0.f330865a
            java.lang.Object r0 = r0.get(r7)
            java.util.List r0 = (java.util.List) r0
            r7 = 0
            if (r0 == 0) goto L_0x008e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x008e
            r0 = 1
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            r10 = 23
            if (r0 == 0) goto L_0x009d
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x009d
            boolean r0 = r6.f330851z
            if (r0 == 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            java.lang.String r11 = "SelectableEditTextHelper"
            if (r0 == 0) goto L_0x01e3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r12 = "tryGetMenus"
            com.tencent.p014mm.p136ui.C85975v4.m106306c(r11, r12, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x01e3
            long r12 = java.lang.System.currentTimeMillis()
            android.widget.TextView r0 = r6.f330833h
            java.lang.String r10 = "textView"
            gy3.C87412m.m108594g(r0, r10)
            java.lang.Class<android.widget.TextView> r10 = android.widget.TextView.class
            java.lang.String r14 = "mTextSelectHandleRes"
            java.lang.reflect.Field r10 = r10.getDeclaredField(r14)     // Catch:{ Exception -> 0x00ce }
            r10.setAccessible(r3)     // Catch:{ Exception -> 0x00ce }
            r14 = 2131235349(0x7f081215, float:1.808689E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x00ce }
            r10.set(r0, r14)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d6
        L_0x00ce:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.String r14 = "disableSysHandleErr"
            com.tencent.p014mm.p136ui.C85975v4.m106307d(r11, r0, r14, r10)
        L_0x00d6:
            android.view.Menu r0 = r6.f330811L
            if (r0 != 0) goto L_0x00e3
            nj3.e0 r0 = new nj3.e0
            android.content.Context r10 = r6.f330832g
            r0.<init>(r10)
            r6.f330811L = r0
        L_0x00e3:
            android.view.Menu r0 = r6.f330811L
            if (r0 == 0) goto L_0x00ea
            r0.clear()
        L_0x00ea:
            ro3.w r0 = r6.f330810K
            android.widget.TextView r10 = r6.f330833h
            android.view.Menu r14 = r6.f330811L
            r0.getClass()
            java.lang.String r15 = "SysMenuConfig"
            if (r10 != 0) goto L_0x00f9
            goto L_0x017a
        L_0x00f9:
            if (r14 != 0) goto L_0x00fd
            goto L_0x017a
        L_0x00fd:
            java.lang.String r3 = android.os.Build.BRAND
            gy3.C87412m.m108593f(r3, r8)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r8)
            gy3.C87412m.m108593f(r3, r9)
            java.util.HashMap<java.lang.String, java.util.List<ro3.w$a>> r0 = r0.f330865a
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0179
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0179
            java.util.Iterator r3 = r0.iterator()
        L_0x011f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r3.next()
            ro3.w$a r0 = (ro3.C110600w.C110601a) r0
            android.content.res.Resources r8 = r10.getResources()     // Catch:{ all -> 0x016a }
            java.lang.String r9 = r0.f330866a     // Catch:{ all -> 0x016a }
            java.lang.String r7 = "id"
            java.lang.String r2 = r0.f330867b     // Catch:{ all -> 0x016a }
            int r2 = r8.getIdentifier(r9, r7, r2)     // Catch:{ all -> 0x016a }
            android.content.res.Resources r7 = r10.getResources()     // Catch:{ all -> 0x016a }
            java.lang.String r8 = r0.f330868c     // Catch:{ all -> 0x016a }
            java.lang.String r9 = "string"
            java.lang.String r0 = r0.f330869d     // Catch:{ all -> 0x016a }
            int r0 = r7.getIdentifier(r8, r9, r0)     // Catch:{ all -> 0x016a }
            java.lang.String r7 = "populateMenuItem id:%s strId:%s"
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x016a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x016a }
            r18 = r3
            r3 = 0
            r9[r3] = r8     // Catch:{ all -> 0x0168 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0168 }
            r16 = 1
            r9[r16] = r8     // Catch:{ all -> 0x0168 }
            com.tencent.p014mm.p136ui.C85975v4.m106306c(r15, r7, r9)     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x0175
            if (r0 == 0) goto L_0x0175
            r14.add(r3, r2, r3, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x0175
        L_0x0168:
            r0 = move-exception
            goto L_0x016d
        L_0x016a:
            r0 = move-exception
            r18 = r3
        L_0x016d:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "populateMenuItem ERR"
            com.tencent.p014mm.p136ui.C85975v4.m106307d(r15, r0, r2, r3)
        L_0x0175:
            r3 = r18
            r7 = 0
            goto L_0x011f
        L_0x0179:
            r7 = 1
        L_0x017a:
            android.view.Menu r0 = r6.f330811L
            if (r0 != 0) goto L_0x017f
            goto L_0x01bf
        L_0x017f:
            int r2 = r0.size()
            r3 = 0
        L_0x0184:
            if (r3 >= r2) goto L_0x01bf
            android.view.MenuItem r8 = r0.getItem(r3)
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r9 = r8.getItemId()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14 = 0
            r10[r14] = r9
            java.lang.CharSequence r9 = r8.getTitle()
            r14 = 1
            r10[r14] = r9
            java.lang.String r9 = "reuse bingo:%s %s"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r11, r9, r10)
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r9 = r6.f330807H
            int r10 = r8.getItemId()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.CharSequence r8 = r8.getTitle()
            java.lang.String r14 = "menuItem.title"
            gy3.C87412m.m108593f(r8, r14)
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.put(r10, r8)
            int r3 = r3 + 1
            goto L_0x0184
        L_0x01bf:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r12
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r0[r8] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r7 = 1
            r0[r7] = r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "startInsertionActionMode SDK_INT:%s ,res:%s, duration:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106306c(r11, r2, r0)
        L_0x01e3:
            ro3.j r0 = r1.f330789a
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r0 = r0.f330807H
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0224
            ro3.j r0 = r1.f330789a
            java.util.Map<java.lang.Integer, java.lang.CharSequence> r0 = r0.f330807H
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01fd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0224
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            ro3.j$b r3 = new ro3.j$b
            java.lang.Object r6 = r2.getValue()
            java.lang.String r6 = r6.toString()
            java.lang.Object r2 = r2.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3.<init>(r6, r2)
            r5.add(r3)
            goto L_0x01fd
        L_0x0224:
            ro3.j r0 = r1.f330789a
            ro3.j$c r0 = r0.f330844s
            if (r0 == 0) goto L_0x022d
            r0.mo14785a(r5, r4)
        L_0x022d:
            ro3.e r0 = r1.f330794f
            r0.f330785d = r5
            r0.notifyDataSetChanged()
            android.widget.PopupWindow r0 = r1.f330790b
            android.view.View r0 = r0.getContentView()
            r2 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r0.measure(r3, r4)
            int r2 = r0.getMeasuredWidth()
            r1.f330791c = r2
            int r0 = r0.getMeasuredHeight()
            r1.f330792d = r0
            ro3.j r0 = r1.f330789a
            android.widget.TextView r2 = r0.f330833h
            int[] r0 = r0.f330808I
            r2.getLocationInWindow(r0)
            ro3.j r0 = r1.f330789a
            android.widget.TextView r0 = r0.f330833h
            android.text.Layout r0 = r0.getLayout()
            ro3.j r2 = r1.f330789a
            android.content.Context r2 = r2.f330832g
            int r2 = xo3.C78967g.m95476i(r2)
            ro3.j r3 = r1.f330789a
            android.content.Context r3 = r3.f330832g
            r4 = 10
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
            int r4 = r3 * 2
            int r4 = r2 - r4
            int r5 = r1.f330791c
            if (r5 < r4) goto L_0x027f
            r1.f330791c = r4
        L_0x027f:
            ro3.j r4 = r1.f330789a
            android.widget.TextView r4 = r4.f330833h
            int r4 = r4.getSelectionStart()
            ro3.j r5 = r1.f330789a
            android.widget.TextView r5 = r5.f330833h
            int r5 = r5.getSelectionEnd()
            float r6 = r0.getPrimaryHorizontal(r4)
            int r6 = (int) r6
            float r7 = r0.getPrimaryHorizontal(r5)
            int r7 = (int) r7
            int r6 = r6 + r7
            r7 = 2
            int r6 = r6 / r7
            ro3.j r8 = r1.f330789a
            int[] r9 = r8.f330808I
            r10 = 0
            r9 = r9[r10]
            int r6 = r6 + r9
            int r9 = r1.f330791c
            int r9 = r9 / r7
            int r6 = r6 - r9
            android.widget.TextView r7 = r8.f330833h
            int r7 = r7.getPaddingLeft()
            int r6 = r6 + r7
            if (r4 == r5) goto L_0x02cf
            int r7 = r0.getLineForOffset(r4)
            int r5 = r0.getLineForOffset(r5)
            if (r7 == r5) goto L_0x02cf
            ro3.j r5 = r1.f330789a
            int[] r6 = r5.f330808I
            r7 = 0
            r6 = r6[r7]
            android.widget.TextView r5 = r5.f330833h
            int r5 = r5.getWidth()
            r7 = 2
            int r5 = r5 / r7
            int r6 = r6 + r5
            int r5 = r1.f330791c
            int r5 = r5 / r7
            int r6 = r6 - r5
        L_0x02cf:
            int r4 = r0.getLineForOffset(r4)
            int r0 = r0.getLineTop(r4)
            ro3.j r4 = r1.f330789a
            int[] r5 = r4.f330808I
            r7 = 1
            r5 = r5[r7]
            int r0 = r0 + r5
            int r5 = r1.f330792d
            int r0 = r0 - r5
            android.widget.TextView r4 = r4.f330833h
            int r4 = r4.getPaddingTop()
            int r0 = r0 + r4
            ro3.j r4 = r1.f330789a
            android.widget.TextView r4 = r4.f330833h
            int r4 = r4.getScrollY()
            int r0 = r0 - r4
            ro3.j r4 = r1.f330789a
            android.content.Context r4 = r4.f330832g
            r5 = 5
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r5)
            int r0 = r0 - r4
            ro3.j r4 = r1.f330789a
            int[] r7 = r4.f330808I
            r8 = 1
            r7 = r7[r8]
            int r9 = r1.f330792d
            int r7 = r7 - r9
            android.content.Context r4 = r4.f330832g
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r5)
            int r7 = r7 - r4
            ro3.j r4 = r1.f330789a
            int[] r9 = r4.f330808I
            r9 = r9[r8]
            android.widget.TextView r4 = r4.f330833h
            int r4 = r4.getHeight()
            int r9 = r9 + r4
            int r4 = r1.f330792d
            int r9 = r9 - r4
            ro3.j r4 = r1.f330789a
            android.content.Context r4 = r4.f330832g
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r5)
            int r9 = r9 - r4
            if (r6 > r3) goto L_0x032a
            r4 = r3
            goto L_0x032b
        L_0x032a:
            r4 = r6
        L_0x032b:
            if (r0 >= r7) goto L_0x032e
            r0 = r7
        L_0x032e:
            if (r0 <= r9) goto L_0x0331
            return
        L_0x0331:
            int r5 = r1.f330791c
            int r7 = r4 + r5
            if (r7 <= r2) goto L_0x033a
            int r2 = r2 - r5
            int r4 = r2 - r3
        L_0x033a:
            android.widget.ImageView r2 = r1.f330796h
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r6 = r6 - r4
            r2.leftMargin = r6
            android.widget.PopupWindow r2 = r1.f330790b
            r3 = 1090519040(0x41000000, float:8.0)
            r2.setElevation(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r1.f330793e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x039e
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r6)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/widget/edittext/OperateWindow"
            java.lang.String r20 = "show"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "scrollToPosition"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.scrollToPosition(r3)
            java.lang.String r18 = "com/tencent/mm/ui/widget/edittext/OperateWindow"
            java.lang.String r19 = "show"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "scrollToPosition"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x039e:
            android.widget.PopupWindow r2 = r1.f330790b
            int r3 = r1.f330791c
            r2.setWidth(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "show() called finalPosX:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " finalPosY:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = "EditHelper.OperateWindow"
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r3, r2, r5)
            android.widget.PopupWindow r2 = r1.f330790b     // Catch:{ Exception -> 0x03e3 }
            boolean r2 = r2.isShowing()     // Catch:{ Exception -> 0x03e3 }
            if (r2 == 0) goto L_0x03d8
            android.widget.PopupWindow r2 = r1.f330790b     // Catch:{ Exception -> 0x03e3 }
            int r3 = r1.f330791c     // Catch:{ Exception -> 0x03e3 }
            int r5 = r1.f330792d     // Catch:{ Exception -> 0x03e3 }
            r2.update(r4, r0, r3, r5)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x03f3
        L_0x03d8:
            android.widget.PopupWindow r2 = r1.f330790b     // Catch:{ Exception -> 0x03e3 }
            ro3.j r3 = r1.f330789a     // Catch:{ Exception -> 0x03e3 }
            android.widget.TextView r3 = r3.f330833h     // Catch:{ Exception -> 0x03e3 }
            r5 = 0
            r2.showAtLocation(r3, r5, r4, r0)     // Catch:{ Exception -> 0x03e3 }
            goto L_0x03f3
        L_0x03e3:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "oper error!:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r11, r0, r2)
        L_0x03f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ro3.C110584g.mo162106a():void");
    }
}
