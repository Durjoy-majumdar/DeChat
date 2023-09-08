package n21;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import p21.C100616a;
import p21.C100628m;
import u21.C101941c;
import w21.C102324u;

/* renamed from: n21.h */
public class C100054h extends C100040a {

    /* renamed from: A */
    public WXRTEditText f293099A;

    /* renamed from: n21.h$a */
    public class C100055a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: n21.h$a$a */
        public class C100056a implements Runnable {
            public C100056a() {
            }

            public void run() {
                C100054h.this.f293099A.hasFocus();
            }
        }

        public C100055a() {
        }

        public void onGlobalLayout() {
            C86709a0.m107525e().postToWorker(new C100056a());
        }
    }

    /* renamed from: n21.h$b */
    public class C100057b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100628m f293102d;

        /* renamed from: n21.h$b$a */
        public class C100058a implements Runnable {
            public C100058a() {
            }

            public void run() {
                C100057b bVar = C100057b.this;
                if (bVar.f293102d.f294804j != 0) {
                    int i = C100054h.this.f293099A.getSelection().f300151d;
                    if (i == C100057b.this.f293102d.f294819s.length()) {
                        C100054h.this.f293099A.mo127556v();
                        C100054h.this.f293099A.getText().append("\n");
                        C100054h.this.f293099A.mo127523A();
                        C100054h.this.f293099A.setSelection(i);
                    }
                    C100057b bVar2 = C100057b.this;
                    C100628m mVar = bVar2.f293102d;
                    mVar.f294804j = 0;
                    int i2 = mVar.f294805k;
                    if (i2 == 1) {
                        C100054h.this.f293099A.mo127545s(C102324u.f301364c, Boolean.TRUE);
                    } else if (i2 == 3) {
                        C100054h.this.f293099A.mo127545s(C102324u.f301363b, Boolean.TRUE);
                    } else if (i2 == 2) {
                        C100054h.this.f293099A.mo127545s(C102324u.f301365d, Boolean.TRUE);
                    }
                }
            }
        }

        public C100057b(C100628m mVar) {
            this.f293102d = mVar;
        }

        public void run() {
            C100054h.this.f293099A.setRichTextEditing(this.f293102d.f294819s);
            C100054h.this.f293099A.mo127556v();
            WXRTEditText wXRTEditText = C100054h.this.f293099A;
            synchronized (wXRTEditText) {
                wXRTEditText.f268154v = true;
            }
            WXRTEditText wXRTEditText2 = C100054h.this.f293099A;
            synchronized (wXRTEditText2) {
                wXRTEditText2.f268154v = false;
            }
            C100054h.this.f293099A.mo127523A();
            C100628m mVar = this.f293102d;
            if (mVar.f294796b) {
                int i = mVar.f294797c;
                if (i == -1 || i >= C100054h.this.f293099A.getText().toString().length()) {
                    WXRTEditText wXRTEditText3 = C100054h.this.f293099A;
                    wXRTEditText3.setSelection(wXRTEditText3.getText().toString().length());
                } else {
                    C100054h.this.f293099A.setSelection(this.f293102d.f294797c);
                }
                C100054h.this.f293099A.requestFocus();
                MMHandlerThread.postToMainThreadDelayed(new C100058a(), 500);
            } else if (C100054h.this.f293099A.hasFocus()) {
                C100054h.this.f293099A.clearFocus();
            }
            C100628m mVar2 = this.f293102d;
            if (mVar2.f294803i) {
                mVar2.f294803i = false;
                WXRTEditText wXRTEditText4 = C100054h.this.f293099A;
                wXRTEditText4.f268131E = true;
                wXRTEditText4.onTextContextMenuItem(16908322);
            }
        }
    }

    public C100054h(View view, C93083b bVar) {
        super(view, bVar);
        WXRTEditText wXRTEditText = (WXRTEditText) view.findViewById(C0966R.C0970id.ix5);
        this.f293099A = wXRTEditText;
        wXRTEditText.f268132F = this;
        wXRTEditText.setEditTextType(0);
        this.f293067z.mo127572f(this.f293099A);
        this.f293099A.getViewTreeObserver().addOnGlobalLayoutListener(new C100055a());
    }

    /* renamed from: y */
    public int mo139367y() {
        return 1;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        Log.m105925i("MicroMsg.Note.EditorTextItemHolder", "TextItemHolder position is %d, editable:%b", Integer.valueOf(mo17364k()), Boolean.valueOf(this.f293067z.f268168d));
        this.f293099A.setPosInDataList(i);
        C100628m mVar = (C100628m) aVar;
        mVar.f294800f = this.f293099A;
        mVar.f294798d = null;
        mVar.f294799e = null;
        C100616a l = C101941c.m134173q().mo141456l(i - 1);
        if (l != null && l.mo140076b() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f293099A.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f293099A.setLayoutParams(layoutParams);
        }
        C100616a l2 = C101941c.m134173q().mo141456l(i + 1);
        if (l2 != null && l2.mo140076b() == 1) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f293099A.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            this.f293099A.setLayoutParams(layoutParams2);
        }
        if (!this.f293067z.f268168d) {
            this.f293099A.setRichTextEditing(mVar.f294819s);
            this.f293067z.f268166b.mo94182L5(this.f293099A);
            return;
        }
        MMHandlerThread.postToMainThread(new C100057b(mVar));
    }
}
