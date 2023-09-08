package ro3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import java.util.List;
import ro3.C110588j;

/* renamed from: ro3.e */
public class C110582e extends RecyclerView.C16613e<C110583a> {

    /* renamed from: d */
    public List<C110588j.C110589b> f330785d;

    /* renamed from: e */
    public C110588j.C110591d f330786e;

    /* renamed from: f */
    public C110588j.C110590c f330787f;

    /* renamed from: ro3.e$a */
    public class C110583a extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f330788z;

        public C110583a(C110582e eVar, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.gsd);
            this.f330788z = textView;
            textView.setTextSize(1, 14.0f);
        }
    }

    public C110582e(List<C110588j.C110589b> list, C110588j.C110590c cVar, C110588j.C110591d dVar) {
        this.f330785d = list;
        this.f330787f = cVar;
        this.f330786e = dVar;
    }

    public int getItemCount() {
        return this.f330785d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C110583a aVar = (C110583a) zVar;
        C110588j.C110589b bVar = this.f330785d.get(i);
        aVar.f330788z.setText(bVar.f330852a);
        aVar.f330788z.setTag(bVar);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b4n, viewGroup, false);
        C110583a aVar = new C110583a(this, inflate);
        inflate.setOnClickListener(new C110581d(this));
        return aVar;
    }
}
