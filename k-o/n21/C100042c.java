package n21;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.C93062a;
import com.tencent.p014mm.plugin.component.editor.C93065b;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorImageUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p21.C100616a;
import p21.C100626k;

/* renamed from: n21.c */
public class C100042c extends C100047f {

    /* renamed from: U */
    public ImageView f293068U;

    /* renamed from: V */
    public int f293069V = 0;

    /* renamed from: W */
    public View.OnClickListener f293070W = new C100043a();

    /* renamed from: n21.c$a */
    public class C100043a implements View.OnClickListener {
        public C100043a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(C100042c.this.f293079B.getContext(), EditorImageUI.class);
            String str = C100042c.this.f293078A.f294795a;
            if (str != null) {
                intent.putExtra("key_detail_data_id", str);
            }
            Context context = C100042c.this.f293079B.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorImageItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C100042c(View view, C93083b bVar) {
        super(view, bVar);
        this.f293079B.setVisibility(0);
        this.f293087J.setVisibility(8);
        this.f293082E.setVisibility(8);
        this.f293079B.setTag(this);
        this.f293079B.setOnClickListener(this.f293070W);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4x);
        this.f293068U = imageView;
        imageView.setVisibility(8);
        this.f293069V = C93083b.f268163f - ((int) TypedValue.applyDimension(1, 20.0f, C93083b.f268164g));
    }

    /* renamed from: y */
    public int mo139367y() {
        return 2;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        C100626k kVar = (C100626k) aVar;
        String str = kVar.f294813r;
        String str2 = kVar.f294806s;
        if (!C86013q1.m106450k(str)) {
            str = C86013q1.m106450k(str2) ? str2 : null;
        }
        Bitmap f = Util.isNullOrNil(str) ? null : C93088r.m117436f(str, (String) null);
        this.f293079B.setImageBitmap((Bitmap) null);
        ViewGroup.LayoutParams layoutParams = this.f293079B.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f293079B.setLayoutParams(layoutParams);
        if (f != null) {
            this.f293079B.setImageBitmap(f);
        } else {
            this.f293079B.setImageBitmap((Bitmap) null);
            ViewGroup.LayoutParams layoutParams2 = this.f293079B.getLayoutParams();
            int i3 = this.f293069V;
            layoutParams2.width = i3;
            layoutParams2.height = i3;
            this.f293079B.setLayoutParams(layoutParams2);
            this.f293079B.setBackgroundColor(Color.parseColor("#f6f6f6"));
            if (Util.isNullOrNil(kVar.f294808m.f299329u) || Util.isNullOrNil(kVar.f294808m.f299325s)) {
                Log.m105920e("MicroMsg.EditorImageItemHolder", "data key or url null!!!");
            } else {
                Log.m105918d("MicroMsg.EditorImageItemHolder", "local data not exist, gen cdnInfo.");
                C93065b.f268104d.mo127511c(new C93062a(kVar.f294808m, false, C93062a.C93063a.TYPE_FILE, i));
            }
        }
        if (aVar.f294802h) {
            this.f293068U.setVisibility(0);
        } else {
            this.f293068U.setVisibility(8);
        }
        super.mo139368z(aVar, i, i2);
    }
}
