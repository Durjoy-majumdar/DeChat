package mw2;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.storage.C96983o3;
import f40.C86709a0;
import fw2.C98059c;
import fw2.C98060d;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import k60.C60979d;
import kw2.C99266g;
import rx3.C13598b0;
import te3.bc4;
import te3.pc4;

/* renamed from: mw2.d */
public final class C100014d extends RecyclerView.C16613e<C100015a> {

    /* renamed from: d */
    public final ArrayList<C99266g> f293028d = new ArrayList<>();

    /* renamed from: e */
    public C32226l<? super C99266g, C13598b0> f293029e;

    /* renamed from: mw2.d$a */
    public final class C100015a extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f293030A;

        /* renamed from: B */
        public TextView f293031B;

        /* renamed from: C */
        public final /* synthetic */ C100014d f293032C;

        /* renamed from: z */
        public ImageView f293033z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100015a(C100014d dVar, View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f293032C = dVar;
            View findViewById = view.findViewById(C0966R.C0970id.f5760nw);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.album_story_item_media_img)");
            this.f293033z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5761nx);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.a…_story_item_multiple_tip)");
            this.f293030A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f5754nq);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.album_story_item_count_tv)");
            this.f293031B = (TextView) findViewById3;
        }
    }

    public int getItemCount() {
        return this.f293028d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C100015a aVar = (C100015a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f293033z.setTag(aVar.f293032C.f293028d.get(i));
        pc4 p2 = aVar.f293032C.f293028d.get(i).f291069p.mo138657p2();
        LinkedList<bc4> linkedList = p2.f299136h.f299398e;
        if (!linkedList.isEmpty()) {
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C60979d<C98059c> m = hVar.mo134195m();
            bc4 bc4 = linkedList.get(0);
            C87412m.m108593f(bc4, "mediaList[0]");
            C98059c cVar = new C98059c(bc4, p2.f299133e, C96983o3.f284143o);
            ImageView imageView = aVar.f293033z;
            C86709a0.m107523b().mo121108c();
            if (hVar.mo134185c().f281748o == null) {
                hVar.mo134185c().f281748o = new C98060d();
            }
            C98060d dVar = hVar.mo134185c().f281748o;
            C87412m.m108591d(dVar);
            m.mo85957c(cVar, imageView, dVar.f287509b);
        }
        if (aVar.f293032C.f293028d.get(i).field_count > 1) {
            ImageView imageView2 = aVar.f293030A;
            imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_photo_wall, Color.parseColor("#FFFFFF")));
            aVar.f293030A.setVisibility(8);
            aVar.f293031B.setText(String.valueOf(aVar.f293032C.f293028d.get(i).field_count));
            aVar.f293031B.setVisibility(0);
            return;
        }
        aVar.f293030A.setVisibility(8);
        aVar.f293031B.setVisibility(8);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f360023c63, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…da_layout, parent, false)");
        C100015a aVar = new C100015a(this, inflate);
        aVar.f293033z.setOnClickListener(new C76811e(this));
        return aVar;
    }
}
