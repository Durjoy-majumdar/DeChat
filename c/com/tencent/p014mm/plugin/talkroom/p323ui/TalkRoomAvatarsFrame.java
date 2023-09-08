package com.tencent.p014mm.plugin.talkroom.p323ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMHorList;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame */
public class TalkRoomAvatarsFrame extends FrameLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f316324j = 0;

    /* renamed from: d */
    public final int f316325d = C76577a.m92151b((Context) null, 58);

    /* renamed from: e */
    public MMHorList f316326e;

    /* renamed from: f */
    public C96515c f316327f;

    /* renamed from: g */
    public MMHandler f316328g;

    /* renamed from: h */
    public MTimerHandler f316329h;

    /* renamed from: i */
    public String f316330i;

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame$c */
    public static class C96515c extends BaseAdapter {

        /* renamed from: d */
        public List<String> f282415d = new LinkedList();

        /* renamed from: e */
        public Context f282416e;

        /* renamed from: f */
        public String f282417f;

        /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame$c$a */
        public class C96516a {

            /* renamed from: a */
            public ImageView f282418a;

            /* renamed from: b */
            public TextView f282419b;

            public C96516a(C96515c cVar) {
            }
        }

        public C96515c(Context context) {
            this.f282416e = context;
        }

        public int getCount() {
            return this.f282415d.size();
        }

        public Object getItem(int i) {
            return this.f282415d.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C96516a aVar;
            String str = this.f282415d.get(i);
            if (view == null) {
                view = View.inflate(this.f282416e, C0966R.C0971layout.c85, (ViewGroup) null);
                aVar = new C96516a(this);
                aVar.f282418a = (ImageView) view.findViewById(C0966R.C0970id.fcc);
                aVar.f282419b = (TextView) view.findViewById(C0966R.C0970id.kxb);
                view.setTag(aVar);
            } else {
                aVar = (C96516a) view.getTag();
            }
            aVar.f282418a.setBackgroundResource(str.equals(this.f282417f) ? C0966R.C0969drawable.bm4 : 0);
            aVar.f282419b.setVisibility(8);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(aVar.f282418a, str, true);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame$a */
    public class C106169a implements MMHorList.C106655d {
        public C106169a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame$b */
    public class C106170b implements MTimerHandler.CallBack {
        public C106170b() {
        }

        public boolean onTimerExpired() {
            TalkRoomAvatarsFrame talkRoomAvatarsFrame = TalkRoomAvatarsFrame.this;
            int i = TalkRoomAvatarsFrame.f316324j;
            talkRoomAvatarsFrame.mo152013a();
            return false;
        }
    }

    public TalkRoomAvatarsFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo152014b();
    }

    /* renamed from: a */
    public final void mo152013a() {
        C96515c cVar = this.f316327f;
        String str = this.f316330i;
        cVar.f282417f = str;
        if (Util.isNullOrNil(str)) {
            this.f316327f.notifyDataSetChanged();
        } else if (!this.f316326e.getIsTouching()) {
            C96515c cVar2 = this.f316327f;
            int indexOf = cVar2.f282415d.indexOf(this.f316330i) * this.f316325d;
            int currentPosition = this.f316326e.getCurrentPosition();
            if (indexOf < currentPosition) {
                this.f316326e.mo153476c(indexOf);
                return;
            }
            int i = this.f316325d;
            if (indexOf > currentPosition + (i * 4)) {
                this.f316326e.mo153476c(indexOf - (i * 4));
            } else {
                this.f316327f.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    public final void mo152014b() {
        View.inflate(getContext(), C0966R.C0971layout.c84, this);
        MMHorList mMHorList = (MMHorList) findViewById(C0966R.C0970id.eww);
        this.f316326e = mMHorList;
        mMHorList.setOverScrollEnabled(true);
        this.f316326e.setCenterInParent(true);
        this.f316326e.setItemWidth(this.f316325d);
        C96515c cVar = new C96515c(getContext());
        this.f316327f = cVar;
        this.f316326e.setAdapter((ListAdapter) cVar);
        this.f316328g = new MMHandler(Looper.getMainLooper());
        this.f316326e.setHorListLitener(new C106169a());
        this.f316329h = new MTimerHandler(new C106170b(), false);
    }

    public void setCurMemeber(String str) {
        if (this.f316326e != null) {
            if (Util.isNullOrNil(this.f316330i) && Util.isNullOrNil(str)) {
                return;
            }
            if (Util.isNullOrNil(this.f316330i) || !this.f316330i.equals(str)) {
                this.f316330i = str;
                mo152013a();
            }
        }
    }

    public void setMembersList(List<String> list) {
        C96515c cVar = this.f316327f;
        if (cVar != null) {
            if (list == null) {
                cVar.f282415d.clear();
            } else {
                cVar.f282415d = list;
            }
            cVar.notifyDataSetChanged();
        }
    }

    public TalkRoomAvatarsFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo152014b();
    }
}
