package lp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lp0.h */
public final class C88626h extends RecyclerView.C16613e<C88627a> {

    /* renamed from: d */
    public final List<String> f255906d;

    /* renamed from: e */
    public final C88624f f255907e;

    /* renamed from: lp0.h$a */
    public class C88627a extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f255908z;

        public C88627a(C88626h hVar, View view) {
            super(view);
        }
    }

    public C88626h(List<String> list, C88624f fVar) {
        this.f255906d = new ArrayList(list);
        this.f255907e = fVar;
    }

    public int getItemCount() {
        return ((ArrayList) this.f255906d).size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C88627a aVar = (C88627a) zVar;
        aVar.f255908z.setText((CharSequence) ((ArrayList) this.f255906d).get(i));
        aVar.f255908z.setOnClickListener(new C88625g(this, i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6467fn, viewGroup, false);
        C88627a aVar = new C88627a(this, inflate);
        aVar.f255908z = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        return aVar;
    }
}
