package kj3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import js0.C9515s;
import lb0.C88394b;
import nj3.C76901s0;

/* renamed from: kj3.o */
public class C76593o implements C88394b.C88411m {

    /* renamed from: d */
    public Context f224174d;

    /* renamed from: e */
    public View f224175e = null;

    /* renamed from: f */
    public View f224176f;

    /* renamed from: g */
    public C76901s0 f224177g;

    /* renamed from: h */
    public TextView f224178h = null;

    /* renamed from: i */
    public ImageView f224179i = null;

    /* renamed from: j */
    public ImageView f224180j = null;

    /* renamed from: n */
    public ProgressBar f224181n = null;

    /* renamed from: o */
    public Bitmap f224182o = null;

    /* renamed from: p */
    public ChatFooter f224183p;

    /* renamed from: q */
    public boolean f224184q = true;

    /* renamed from: r */
    public C76594a f224185r;

    /* renamed from: s */
    public MMHandler f224186s = null;

    /* renamed from: kj3.o$a */
    public interface C76594a {
        /* renamed from: a */
        void mo70225a();
    }

    public C76593o(Context context, View view, ChatFooter chatFooter) {
        this.f224174d = context;
        this.f224176f = view;
        this.f224183p = chatFooter;
        View inflate = View.inflate(context, C0966R.C0971layout.f6839py, (ViewGroup) null);
        this.f224175e = inflate;
        this.f224178h = (TextView) inflate.findViewById(C0966R.C0970id.nwn);
        this.f224179i = (ImageView) this.f224175e.findViewById(C0966R.C0970id.f4k);
        this.f224180j = (ImageView) this.f224175e.findViewById(C0966R.C0970id.ckv);
        this.f224181n = (ProgressBar) this.f224175e.findViewById(C0966R.C0970id.f358442f53);
        C76901s0 s0Var = new C76901s0(this.f224175e, -2, -2, true);
        this.f224177g = s0Var;
        s0Var.setBackgroundDrawable(new ColorDrawable(0));
        this.f224177g.setOutsideTouchable(true);
        this.f224177g.setFocusable(false);
        this.f224175e.setOnClickListener(new C76589k(this));
        this.f224186s = new C76590l(this, this.f224174d.getMainLooper());
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105924i("MicroMsg.AppBrandServiceImageBubble", "onLoadFailed");
        this.f224180j.setVisibility(0);
        this.f224181n.setVisibility(8);
        this.f224179i.setVisibility(8);
    }

    /* renamed from: d */
    public void mo1908d() {
        Log.m105918d("MicroMsg.AppBrandServiceImageBubble", "beforeLoadBitmap");
        this.f224181n.setVisibility(0);
        this.f224179i.setVisibility(8);
        this.f224180j.setVisibility(8);
    }

    public String key() {
        return C9515s.m9209a(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        Log.m105918d("MicroMsg.AppBrandServiceImageBubble", "onBitmapLoaded");
        if (bitmap == null) {
            Log.m105928w("MicroMsg.AppBrandServiceImageBubble", "bitmap is null");
            return;
        }
        this.f224182o = bitmap;
        this.f224181n.setVisibility(8);
        if (!bitmap.isRecycled()) {
            this.f224179i.setVisibility(0);
            this.f224179i.setImageBitmap(bitmap);
            this.f224180j.setVisibility(8);
            return;
        }
        this.f224180j.setVisibility(0);
        this.f224179i.setVisibility(8);
    }
}
