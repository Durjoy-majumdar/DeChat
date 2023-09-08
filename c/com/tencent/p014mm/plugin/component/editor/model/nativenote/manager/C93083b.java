package com.tencent.p014mm.plugin.component.editor.model.nativenote.manager;

import android.text.Spannable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p21.C100616a;
import p21.C100628m;
import p21.C100631p;
import r21.C101336a;
import t21.C101713b;
import t21.C101714c;
import u21.C101941c;
import u21.C101956h;
import w21.C102310h;
import w21.C102313k;
import w21.C102321r;
import w21.C102323t;
import w21.C102324u;
import wc3.C78538u;
import x21.C102538a;

/* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.b */
public class C93083b implements C101714c {

    /* renamed from: f */
    public static int f268163f;

    /* renamed from: g */
    public static DisplayMetrics f268164g;

    /* renamed from: a */
    public transient ArrayList<WXRTEditText> f268165a = new ArrayList<>();

    /* renamed from: b */
    public C101336a f268166b;

    /* renamed from: c */
    public C101713b f268167c = null;

    /* renamed from: d */
    public boolean f268168d = false;

    /* renamed from: e */
    public View.OnKeyListener f268169e = new C93084a();

    /* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.manager.b$a */
    public class C93084a implements View.OnKeyListener {
        public C93084a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            } else if (C101941c.m134173q().mo141443B() == 0) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            } else {
                WXRTEditText b = C93083b.this.mo127568b();
                if (b == null) {
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return false;
                }
                int recyclerItemPosition = b.getRecyclerItemPosition();
                Log.m105925i("MicroMsg.WXRTManager", "current focus pos: %d", Integer.valueOf(recyclerItemPosition));
                C100616a l = C101941c.m134173q().mo141456l(recyclerItemPosition);
                if (l == null) {
                    Log.m105929w("MicroMsg.WXRTManager", "get current item is null %d", Integer.valueOf(recyclerItemPosition));
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return false;
                }
                int i2 = recyclerItemPosition - 1;
                C100616a l2 = C101941c.m134173q().mo141456l(i2);
                if (l2 == null) {
                    Log.m105925i("MicroMsg.WXRTManager", "get preItem is null %d", Integer.valueOf(recyclerItemPosition));
                    if (b.getEditTextType() == 0 && !C93083b.m117421a(C93083b.this, b, recyclerItemPosition)) {
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                        return false;
                    }
                }
                int editTextType = b.getEditTextType();
                if (editTextType == 0) {
                    Log.m105924i("MicroMsg.WXRTManager", "Handle Editor Type EDITTEXT");
                    if (!C93083b.m117421a(C93083b.this, b, recyclerItemPosition)) {
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                        return false;
                    }
                    String u = b.mo127555u(C26891a.f74781b);
                    C101941c.m134173q().mo141453i();
                    if (l2.mo140076b() == 1) {
                        z = C101941c.m134173q().mo141466w(recyclerItemPosition, true);
                        C100628m mVar = (C100628m) l2;
                        mVar.f294819s += u;
                        mVar.f294797c = mVar.f294800f.getText().toString().length();
                        mVar.f294796b = true;
                        mVar.f294801g = false;
                    } else {
                        z = Util.isNullOrNil(u) ? C101941c.m134173q().mo141466w(recyclerItemPosition, true) : false;
                        l2.f294799e.setSelection(0);
                        l2.f294796b = true;
                        l2.f294801g = false;
                    }
                    if (z) {
                        EditorUI editorUI = (EditorUI) C93083b.this.f268166b;
                        editorUI.getClass();
                        editorUI.mo94191h2(i2, 0);
                    } else {
                        EditorUI editorUI2 = (EditorUI) C93083b.this.f268166b;
                        editorUI2.getClass();
                        editorUI2.mo127485T7(i2, 2);
                    }
                } else if (editTextType == 1) {
                    Log.m105924i("MicroMsg.WXRTManager", "Handle Editor Type PREBUTTON");
                    if (l2 == null) {
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                        return false;
                    }
                    C101941c.m134173q().mo141453i();
                    if (l2.mo140076b() == 1) {
                        C100628m mVar2 = (C100628m) l2;
                        if (Util.isNullOrNil(mVar2.f294819s)) {
                            l.f294798d.setSelection(0);
                            l.f294796b = true;
                            l.f294801g = true;
                            C101941c.m134173q().mo141466w(i2, true);
                            C117292a.m165362h(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                            return true;
                        } else if (mVar2.f294819s.endsWith("<br/>")) {
                            String str = mVar2.f294819s;
                            mVar2.f294819s = str.substring(0, str.length() - 5);
                            mVar2.f294797c = -1;
                            mVar2.f294796b = true;
                            mVar2.f294801g = false;
                        } else {
                            mVar2.f294797c = -1;
                            mVar2.f294796b = true;
                            mVar2.f294801g = false;
                        }
                    } else {
                        l2.f294799e.setSelection(0);
                        l2.f294796b = true;
                        l2.f294801g = false;
                    }
                    EditorUI editorUI3 = (EditorUI) C93083b.this.f268166b;
                    editorUI3.getClass();
                    editorUI3.mo127485T7(i2, 2);
                } else if (editTextType == 2) {
                    Log.m105924i("MicroMsg.WXRTManager", "Handle Editor Type NEXTBTTTON");
                    if (l.mo140076b() == 4 && ((C100631p) l).f294830w.booleanValue()) {
                        Log.m105924i("MicroMsg.WXRTManager", "Current Item is Voice and Recording");
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                        return false;
                    } else if (l.f294802h || l.mo140076b() == -1) {
                        C101941c.m134173q().mo141453i();
                        C101941c.m134173q().mo141466w(recyclerItemPosition, false);
                        EditorUI editorUI4 = (EditorUI) C93083b.this.f268166b;
                        editorUI4.getClass();
                        editorUI4.mo94186d5(recyclerItemPosition);
                        C100628m mVar3 = new C100628m();
                        mVar3.f294796b = true;
                        mVar3.f294801g = false;
                        mVar3.f294819s = "";
                        mVar3.f294797c = 0;
                        C101941c.m134173q().mo141445a(recyclerItemPosition, mVar3, true);
                        C101941c.m134173q().mo141448d(i2, recyclerItemPosition + 1, true);
                        RecyclerView recyclerView = ((EditorUI) C93083b.this.f268166b).f268042d;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(recyclerItemPosition));
                        RecyclerView recyclerView2 = recyclerView;
                        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                    } else {
                        C101941c.m134173q().mo141469z(recyclerItemPosition, true, true);
                        C117292a.m165362h(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                        return true;
                    }
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/WXRTManager$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
        }
    }

    public C93083b(C101336a aVar) {
        this.f268166b = aVar;
        EditorUI editorUI = (EditorUI) aVar;
        C78538u.m94865a(editorUI.getContext());
        C85875k4.m106200p(editorUI.getContext());
        int[] screenWH = KeyBoardUtil.getScreenWH(editorUI.getContext());
        int i = screenWH[1];
        f268163f = screenWH[0];
        DisplayMetrics displayMetrics = editorUI.getContext().getResources().getDisplayMetrics();
        f268164g = displayMetrics;
        TypedValue.applyDimension(1, 8.0f, displayMetrics);
        C102313k.f301326h = 0.0f;
    }

    /* renamed from: a */
    public static boolean m117421a(C93083b bVar, WXRTEditText wXRTEditText, int i) {
        bVar.getClass();
        int selectionStart = wXRTEditText.getSelectionStart();
        if (selectionStart == wXRTEditText.getSelectionEnd()) {
            if (selectionStart == wXRTEditText.getParagraphsInSelection().f300151d) {
                wXRTEditText.f268138L = true;
                C102321r rVar = C102324u.f301363b;
                Boolean bool = Boolean.FALSE;
                bVar.mo127570d(rVar, bool);
                bVar.mo127570d(C102324u.f301364c, bool);
                bVar.mo127570d(C102324u.f301365d, bool);
                bVar.mo127570d(C102324u.f301362a, bool);
                C102538a aVar = (C102538a) bVar.f268167c;
                aVar.f301926q = false;
                aVar.f301919j.setPressed(false);
                C102538a aVar2 = (C102538a) bVar.f268167c;
                aVar2.f301927r = false;
                aVar2.f301920k.setPressed(false);
                C102538a aVar3 = (C102538a) bVar.f268167c;
                aVar3.f301928s = false;
                aVar3.f301922m.setPressed(false);
                wXRTEditText.f268138L = false;
            }
            return selectionStart == 0 && i != 0;
        }
    }

    /* renamed from: b */
    public WXRTEditText mo127568b() {
        C101941c q = C101941c.m134173q();
        ArrayList<WXRTEditText> arrayList = this.f268165a;
        q.getClass();
        if (arrayList != null) {
            arrayList.clear();
            synchronized (q) {
                ArrayList<C100616a> arrayList2 = q.f300117a;
                if (arrayList2 != null) {
                    Iterator<C100616a> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C100616a next = it.next();
                        WXRTEditText wXRTEditText = next.f294800f;
                        if (wXRTEditText != null) {
                            arrayList.add(wXRTEditText);
                        } else {
                            WXRTEditText wXRTEditText2 = next.f294798d;
                            if (!(wXRTEditText2 == null || next.f294799e == null)) {
                                arrayList.add(wXRTEditText2);
                                arrayList.add(next.f294799e);
                            }
                        }
                    }
                }
            }
        }
        ArrayList<WXRTEditText> arrayList3 = this.f268165a;
        if (arrayList3 == null) {
            return null;
        }
        Iterator<WXRTEditText> it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            WXRTEditText next2 = it4.next();
            if (next2.hasFocus()) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public WXRTEditText mo127569c() {
        WXRTEditText b = mo127568b();
        if (b != null || this.f268165a.size() < 1) {
            return b;
        }
        ArrayList<WXRTEditText> arrayList = this.f268165a;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: d */
    public <V, C extends C102310h<V>> void mo127570d(C102323t<V, C> tVar, V v) {
        WXRTEditText b = mo127568b();
        if (b == null) {
            return;
        }
        if (b.getEditTextType() == 0) {
            int i = b.getSelection().f300151d;
            int length = b.getText().length();
            if ((v instanceof Boolean) && ((Boolean) v).booleanValue() && i == length) {
                b.mo127556v();
                b.getText().append("\n");
                b.mo127523A();
                b.setSelection(i);
            }
            b.mo127545s(tVar, v);
            return;
        }
        b.f268140N = true;
        b.f268139M = tVar.mo141854b();
        b.getText().append("\n");
    }

    /* renamed from: e */
    public void mo127571e(WXRTEditText wXRTEditText, Spannable spannable, Spannable spannable2, int i, int i2, int i3, int i4) {
        String u = wXRTEditText.mo127555u(C26891a.f74781b);
        if (wXRTEditText.getEditTextType() == 0) {
            C100616a l = C101941c.m134173q().mo141456l(wXRTEditText.getRecyclerItemPosition());
            if (l != null && l.mo140076b() == 1) {
                int h = (spannable2 == null ? 0 : C93088r.m117438h(spannable2.toString())) - (spannable == null ? 0 : C93088r.m117438h(spannable.toString()));
                if (C101941c.m134173q().mo141450f(h, 0)) {
                    EditorUI editorUI = (EditorUI) this.f268166b;
                    editorUI.getClass();
                    editorUI.mo127486U7();
                    EditorUI editorUI2 = (EditorUI) this.f268166b;
                    editorUI2.getClass();
                    editorUI2.mo94191h2(wXRTEditText.getRecyclerItemPosition(), 0);
                } else {
                    C101941c.m134173q().mo141453i();
                    C100628m mVar = (C100628m) l;
                    mVar.f294797c = i4;
                    mVar.f294819s = u;
                    mVar.f294796b = true;
                    l.f294801g = false;
                    C101941c.m134173q().f300121e += h;
                }
            }
        } else {
            wXRTEditText.setText("");
            if (!Util.isNullOrNil(u)) {
                C100628m mVar2 = new C100628m();
                if (u.equals("<br/>")) {
                    u = "";
                }
                mVar2.f294819s = u;
                int r = C101941c.m134173q().mo141461r(mVar2, wXRTEditText, true, true, true, false, false);
                C101941c.m134173q().mo141448d(r - 1, r + 1, true);
            } else {
                return;
            }
        }
        EditorUI editorUI3 = (EditorUI) this.f268166b;
        editorUI3.getClass();
        editorUI3.mo94192k6();
    }

    /* renamed from: f */
    public void mo127572f(WXRTEditText wXRTEditText) {
        if (wXRTEditText.f268129C == 0) {
            wXRTEditText.setTextSize(0, (float) C76577a.m92157h(wXRTEditText.getContext(), C0966R.dimen.f3927j7));
        }
        C101956h.f300156d = wXRTEditText.getTextSize();
        wXRTEditText.f268151s = this;
        wXRTEditText.setRichTextEditing((String) null);
        wXRTEditText.setOnKeyListener(this.f268169e);
    }

    /* renamed from: g */
    public void mo127573g(int i, long j) {
        EditorUI editorUI = (EditorUI) this.f268166b;
        editorUI.getClass();
        editorUI.mo127490Y7(i, j);
    }

    /* renamed from: h */
    public void mo127574h(boolean z, long j) {
        EditorUI editorUI = (EditorUI) this.f268166b;
        editorUI.getClass();
        editorUI.mo127491Z7(z, j);
    }
}
