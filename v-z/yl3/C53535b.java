package yl3;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import nj3.C76901s0;

/* renamed from: yl3.b */
public class C53535b extends C76901s0 {

    /* renamed from: f */
    public long f150506f = 3000;

    /* renamed from: g */
    public MMHandler f150507g = new C53536a();

    /* renamed from: yl3.b$a */
    public class C53536a extends MMHandler {
        public C53536a() {
        }

        public void handleMessage(Message message) {
            if (message.what != 256) {
                super.handleMessage(message);
            } else {
                C53535b.this.dismiss();
            }
        }
    }

    public C53535b(View view) {
        super(view);
    }

    /* renamed from: a */
    public static C53535b m60080a(Context context, String str, long j, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c_u, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        C53535b bVar = new C53535b(inflate);
        bVar.setFocusable(false);
        bVar.setContentView(inflate);
        bVar.setWidth(-1);
        if (z) {
            bVar.setHeight(-1);
        } else {
            bVar.setHeight(-2);
        }
        bVar.setAnimationStyle(C0966R.style.f8827z9);
        bVar.f150506f = j;
        return bVar;
    }

    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        this.f150507g.removeMessages(256);
        this.f150507g.sendEmptyMessageDelayed(256, this.f150506f);
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        this.f150507g.removeMessages(256);
        this.f150507g.sendEmptyMessageDelayed(256, this.f150506f);
    }

    public void showAsDropDown(View view) {
        super.showAsDropDown(view);
        this.f150507g.removeMessages(256);
        this.f150507g.sendEmptyMessageDelayed(256, this.f150506f);
    }
}
