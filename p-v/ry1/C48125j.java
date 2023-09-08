package ry1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qy1.C12934a;
import uy1.C52642c;

/* renamed from: ry1.j */
public class C48125j extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public Context f129008d;

    /* renamed from: e */
    public LayoutInflater f129009e;

    /* renamed from: f */
    public int f129010f;

    /* renamed from: g */
    public String f129011g;

    /* renamed from: ry1.j$a */
    public static class C48126a {

        /* renamed from: a */
        public int f129012a;

        /* renamed from: b */
        public String f129013b;

        /* renamed from: c */
        public String f129014c;

        public C48126a(int i, String str, String str2) {
            this.f129012a = i;
            this.f129013b = str;
            this.f129014c = str2;
        }
    }

    public C48125j(Context context) {
        super(context);
        this.f129008d = context;
        this.f129009e = (LayoutInflater) context.getSystemService("layout_inflater");
        setOrientation(1);
    }

    /* renamed from: a */
    public final void mo72866a(ViewGroup viewGroup) {
        ImageView imageView = (ImageView) this.f129009e.inflate(C0966R.C0971layout.avw, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.leftMargin = C76577a.m92151b(this.f129008d, 20);
        imageView.setLayoutParams(marginLayoutParams);
        viewGroup.addView(imageView);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C48126a)) {
            Log.m105928w("MicroMsg.GameBlockContentView", "getTag is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C48126a aVar = (C48126a) view.getTag();
        if (Util.isNullOrNil(aVar.f129013b)) {
            Log.m105928w("MicroMsg.GameBlockContentView", "jumpUrl is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40314g.m43487f(this.f129008d, 10, 1002, aVar.f129012a, C52642c.m59002t(this.f129008d, aVar.f129013b, "game_center_mygame_comm"), this.f129011g, this.f129010f, C12934a.m12382d(aVar.f129014c));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
