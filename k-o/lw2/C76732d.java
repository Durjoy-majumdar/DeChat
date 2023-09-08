package lw2;

import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bw2.C92326a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.GregorianCalendar;
import java.util.List;
import o40.C61926c;
import z04.C112550d0;

/* renamed from: lw2.d */
public final class C76732d extends C76734e<C76733a> {

    /* renamed from: lw2.d$a */
    public final class C76733a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f224489A;

        /* renamed from: B */
        public final ImageView f224490B;

        /* renamed from: z */
        public final View f224491z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76733a(C76732d dVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f359312k70);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…y_gallery_header_date_ll)");
            this.f224491z = findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.bz7);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.date_tv)");
            this.f224489A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f6145yj);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.arrow)");
            this.f224490B = (ImageView) findViewById3;
        }
    }

    public int getItemCount() {
        return this.f224492d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        long j;
        C76733a aVar = (C76733a) zVar;
        C87412m.m108594g(aVar, "holder");
        String str = this.f224492d.get(i);
        C87412m.m108593f(str, "dataList[position]");
        String str2 = str;
        if (!C87412m.m108589b(str2, "")) {
            C92326a.C92327a aVar2 = C92326a.f264186a;
            try {
                List U = C112550d0.m153785U(str2, new String[]{"-"}, false, 0, 6, (Object) null);
                j = new GregorianCalendar(Integer.parseInt((String) U.get(0)), Integer.parseInt((String) U.get(1)) - 1, Integer.parseInt((String) U.get(2))).getTimeInMillis();
            } catch (Exception e) {
                C92326a.C92327a aVar3 = C92326a.f264186a;
                Log.printErrStackTrace("MicroMsg.StoryTimeUtil", e, e.getMessage(), new Object[0]);
                j = 0;
            }
            CharSequence format = DateFormat.format(MMApplicationContext.getContext().getString(C0966R.string.jqn), j);
            C87412m.m108593f(format, "format(MMApplicationCont…allery_date_split), time)");
            List U2 = C112550d0.m153785U(format, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
            if (U2.size() == 3) {
                TextView textView = aVar.f224489A;
                textView.setText(((String) U2.get(1)) + ((String) U2.get(2)));
            }
            C61926c.m72678c(aVar.f224489A);
            aVar.f224491z.setBackground((Drawable) null);
            aVar.f224490B.setVisibility(8);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c6s, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context)\n   …date_view, parent, false)");
        return new C76733a(this, inflate);
    }
}
