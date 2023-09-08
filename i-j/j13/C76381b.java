package j13;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j13.b */
public class C76381b extends RecyclerView.C16613e<C76383b> {

    /* renamed from: d */
    public List<C76382a> f223662d = new ArrayList();

    /* renamed from: e */
    public int f223663e = -1;

    /* renamed from: f */
    public ImageView f223664f = null;

    /* renamed from: j13.b$a */
    public static class C76382a {

        /* renamed from: a */
        public String f223665a;

        /* renamed from: b */
        public int f223666b;

        public C76382a(String str, int i) {
            this.f223665a = str;
            this.f223666b = i;
        }
    }

    /* renamed from: j13.b$b */
    public class C76383b extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f223667A = null;

        /* renamed from: z */
        public TextView f223668z = null;

        public C76383b(C76381b bVar, View view) {
            super(view);
            this.f223668z = (TextView) view.findViewById(C0966R.C0970id.hes);
            this.f223667A = (ImageView) view.findViewById(C0966R.C0970id.hen);
        }
    }

    public int getItemCount() {
        return ((ArrayList) this.f223662d).size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C76383b bVar = (C76383b) zVar;
        String str = ((C76382a) ((ArrayList) this.f223662d).get(i)).f223665a;
        int i2 = ((C76382a) ((ArrayList) this.f223662d).get(i)).f223666b;
        bVar.f223668z.setText(str);
        if (this.f223663e == i2) {
            bVar.f223667A.setVisibility(0);
            this.f223664f = bVar.f223667A;
        } else {
            bVar.f223667A.setVisibility(8);
        }
        bVar.f44854d.setOnClickListener(new C76380a(this, bVar, i2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C76383b(this, View.inflate(viewGroup.getContext(), C0966R.C0971layout.bkz, (ViewGroup) null));
    }
}
