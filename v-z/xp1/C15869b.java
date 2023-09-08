package xp1;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.FileReaderHelper;
import gy3.C87412m;
import java.util.List;
import nj3.C76879j;
import p910lj.C76701a;
import qo3.C77398g;

/* renamed from: xp1.b */
public final class C15869b {

    /* renamed from: a */
    public static final C15869b f42722a = new C15869b();

    /* renamed from: xp1.b$a */
    public static final class C15870a extends RecyclerView.C16613e<C15871b> {

        /* renamed from: d */
        public final List<String> f42723d;

        /* renamed from: e */
        public final DialogInterface.OnClickListener f42724e;

        /* renamed from: f */
        public DialogInterface f42725f;

        public C15870a(List<String> list, DialogInterface.OnClickListener onClickListener) {
            C87412m.m108594g(list, "dataList");
            this.f42723d = list;
            this.f42724e = onClickListener;
        }

        public int getItemCount() {
            return this.f42723d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C15871b bVar = (C15871b) zVar;
            C87412m.m108594g(bVar, "holder");
            TextView textView = bVar.f42726z;
            if (textView != null) {
                textView.setText(this.f42723d.get(i));
            }
            bVar.f44854d.setOnClickListener(new C15868a(this, bVar, i));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7119yv, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C15871b(inflate);
        }
    }

    /* renamed from: xp1.b$b */
    public static final class C15871b extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f42726z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15871b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f42726z = (TextView) view.findViewById(C0966R.C0970id.k95);
        }
    }

    /* renamed from: xp1.b$c */
    public static final class C15872c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C15872c f42727d = new C15872c();

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.DebugDialog", "onClickCancel");
        }
    }

    /* renamed from: xp1.b$d */
    public static final class C15873d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f42728d;

        /* renamed from: e */
        public final /* synthetic */ String f42729e;

        /* renamed from: f */
        public final /* synthetic */ Context f42730f;

        public C15873d(String str, String str2, Context context) {
            this.f42728d = str;
            this.f42729e = str2;
            this.f42730f = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.DebugDialog", "onClick1");
            ClipboardHelper.setText(this.f42728d + 10 + this.f42729e);
            C76701a.makeText(this.f42730f, (CharSequence) "copy done", 0).show();
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m14792b(C15869b bVar, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        bVar.mo14523a(context, str, str2);
    }

    /* renamed from: c */
    public static C77398g m14793c(C15869b bVar, Context context, List list, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "Stream信息";
        }
        String str2 = str;
        if ((i & 8) != 0) {
            onClickListener = null;
        }
        if ((i & 16) != 0) {
            onClickListener2 = null;
        }
        if ((i & 32) != 0) {
            onClickListener3 = null;
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "dataList");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        C15870a aVar = new C15870a(list, onClickListener3);
        recyclerView.setAdapter(aVar);
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        C77398g r = C76879j.m92747r(context, str2, recyclerView, "Close", "Cancel", onClickListener == null ? C15876e.f42734d : onClickListener, onClickListener2 == null ? C15877f.f42735d : onClickListener2);
        aVar.f42725f = r;
        C87412m.m108593f(r, "dialog");
        return r;
    }

    /* renamed from: a */
    public final void mo14523a(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, FileReaderHelper.TXT_EXT);
        C87412m.m108594g(str2, "extraCopyMsg");
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setGravity(3);
        textView.setTextSize(1, 13.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(C0966R.color.f3133gi));
        textView.setTypeface(Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        C15873d dVar = new C15873d(str, str2, context);
        C15872c cVar = C15872c.f42727d;
        Log.m105924i("MicroMsg.DebugDialog", "dialog msg " + str);
        C76879j.m92747r(context, "视频号测试", textView, "copy", "cancel", dVar, cVar);
    }
}
