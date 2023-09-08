package x22;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMHorList;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import p196ln.C76705f;
import t22.C77832s;

/* renamed from: x22.i */
public class C112028i {

    /* renamed from: a */
    public MMHorList f335357a;

    /* renamed from: b */
    public Context f335358b;

    /* renamed from: c */
    public String f335359c = "";

    /* renamed from: d */
    public C112029a f335360d;

    /* renamed from: e */
    public int f335361e;

    /* renamed from: f */
    public MMHandler f335362f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public C112032c f335363g = null;

    /* renamed from: x22.i$a */
    public class C112029a extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<C112030b> f335364d;

        public C112029a(C112028i iVar, ArrayList<C112030b> arrayList) {
            ArrayList<C112030b> arrayList2 = new ArrayList<>();
            this.f335364d = arrayList2;
            arrayList2.addAll(arrayList);
        }

        /* renamed from: a */
        public C112030b mo163743a(String str) {
            for (int i = 0; i < this.f335364d.size(); i++) {
                if (this.f335364d.get(i).f335365a.equals(str)) {
                    return this.f335364d.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo163744b(String str) {
            for (int i = 0; i < this.f335364d.size(); i++) {
                if (this.f335364d.get(i).f335365a.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public int getCount() {
            return this.f335364d.size();
        }

        public Object getItem(int i) {
            return this.f335364d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return this.f335364d.get(i).f335368d.f335369a;
        }
    }

    /* renamed from: x22.i$b */
    public class C112030b {

        /* renamed from: a */
        public String f335365a;

        /* renamed from: b */
        public boolean f335366b = false;

        /* renamed from: c */
        public LinearLayout.LayoutParams f335367c;

        /* renamed from: d */
        public C112031a f335368d;

        /* renamed from: x22.i$b$a */
        public class C112031a {

            /* renamed from: a */
            public RelativeLayout f335369a;

            /* renamed from: b */
            public ImageView f335370b;

            public C112031a(C112030b bVar) {
            }
        }

        public C112030b(C112028i iVar, String str) {
            this.f335365a = str;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.ShareHeaderAvatarViewMgr", "init HeaderAvatar, username can't not be null");
                return;
            }
            this.f335368d = new C112031a(this);
            this.f335368d.f335369a = (RelativeLayout) ((LayoutInflater) iVar.f335358b.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.b86, (ViewGroup) null);
            C112031a aVar = this.f335368d;
            aVar.f335370b = (ImageView) aVar.f335369a.findViewById(C0966R.C0970id.a1p);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(this.f335368d.f335370b, this.f335365a);
            this.f335368d.f335369a.setTag(this.f335365a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f335367c = layoutParams;
            layoutParams.leftMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(iVar.f335358b, 5.0f);
            this.f335367c.rightMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(iVar.f335358b, 5.0f);
            this.f335367c.gravity = 17;
        }

        /* renamed from: a */
        public void mo163749a() {
            Log.m105925i("MicroMsg.ShareHeaderAvatarViewMgr", "exitTalking, username=%s", this.f335365a);
            this.f335368d.f335369a.setBackgroundResource(C0966R.C0969drawable.bhe);
            this.f335368d.f335369a.invalidate();
            this.f335366b = false;
        }

        /* renamed from: b */
        public void mo163750b() {
            Log.m105925i("MicroMsg.ShareHeaderAvatarViewMgr", "setTalking, username=%s", this.f335365a);
            this.f335368d.f335369a.setBackgroundResource(C0966R.C0969drawable.bhf);
            this.f335368d.f335369a.invalidate();
            this.f335366b = true;
        }
    }

    /* renamed from: x22.i$c */
    public interface C112032c {
    }

    public C112028i(Context context, View view, String str) {
        this.f335358b = context;
        this.f335357a = (MMHorList) view;
        this.f335359c = str;
        LinkedList<String> c = C77832s.Bx0().mo107950c(this.f335359c);
        Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "initAvatarList, memebers.size=%d", Integer.valueOf(c.size()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String next : c) {
            if (!Util.isNullOrNil(next)) {
                arrayList.add(new C112030b(this, next));
                arrayList2.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C112030b bVar = (C112030b) it.next();
            if (bVar.f335366b) {
                bVar.mo163750b();
            }
        }
        this.f335361e = C76577a.m92151b(this.f335358b, 60);
        this.f335357a.setOverScrollEnabled(true);
        this.f335357a.setItemWidth(this.f335361e);
        this.f335357a.setCenterInParent(true);
        this.f335357a.setOnItemClickListener(new C118795g(this));
        C112029a aVar = new C112029a(this, arrayList);
        this.f335360d = aVar;
        this.f335357a.setAdapter((ListAdapter) aVar);
        mo163741b(arrayList2);
        this.f335357a.invalidate();
        this.f335360d.notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo163740a(String str) {
        int i = 0;
        Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberTalk, username=%s", str);
        if (this.f335360d.mo163744b(str)) {
            this.f335360d.mo163743a(str).mo163750b();
            this.f335360d.notifyDataSetChanged();
            this.f335357a.invalidate();
            if (!this.f335357a.getIsTouching() && !Util.isNullOrNil(str)) {
                C112029a aVar = this.f335360d;
                int i2 = 0;
                while (true) {
                    if (i2 >= aVar.f335364d.size()) {
                        i2 = -1;
                        break;
                    } else if (aVar.f335364d.get(i2).f335365a.equals(str)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "scrollToTalker, index=%d", Integer.valueOf(i2));
                if (i2 != -1) {
                    int i3 = this.f335361e * i2;
                    int currentPosition = this.f335357a.getCurrentPosition();
                    if (i3 >= currentPosition) {
                        int i4 = this.f335361e * 3;
                        currentPosition = i3 > currentPosition + i4 ? i3 - i4 : 0;
                    }
                    if (i2 != 0) {
                        i = currentPosition;
                    }
                    this.f335362f.post(new C112027h(this, i));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo163741b(ArrayList<String> arrayList) {
        Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "onRefreshMemberList, members.size=%d", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C112029a aVar = this.f335360d;
        aVar.getClass();
        ArrayList arrayList4 = new ArrayList();
        Iterator<C112030b> it = aVar.f335364d.iterator();
        while (it.hasNext()) {
            arrayList4.add(it.next().f335365a);
        }
        Iterator<String> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            String next = it4.next();
            if (arrayList4.indexOf(next) == -1) {
                arrayList2.add(next);
            }
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            String str = (String) it5.next();
            if (arrayList.indexOf(str) == -1) {
                arrayList3.add(str);
            }
        }
        Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "onRefreshMemberList, newMember.size=%d, removeMember.size=%d", Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList3.size()));
        if (arrayList2.size() > 0) {
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                String str2 = (String) it6.next();
                Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberEnter, usernmae=%s", str2);
                if (!this.f335360d.mo163744b(str2)) {
                    C112030b bVar = new C112030b(this, str2);
                    C112029a aVar2 = this.f335360d;
                    aVar2.f335364d.add(bVar);
                    aVar2.notifyDataSetChanged();
                    this.f335357a.invalidate();
                }
            }
        }
        if (arrayList3.size() > 0) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                String str3 = (String) it7.next();
                Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "onMemberExit, username=%s", str3);
                if (this.f335360d.mo163744b(str3)) {
                    C112029a aVar3 = this.f335360d;
                    int i = 0;
                    while (true) {
                        if (i >= aVar3.f335364d.size()) {
                            i = -1;
                            break;
                        } else if (aVar3.f335364d.get(i).f335365a.equals(str3)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        aVar3.f335364d.remove(i);
                        aVar3.notifyDataSetChanged();
                    }
                    this.f335357a.invalidate();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo163742c() {
        C112029a aVar = this.f335360d;
        Iterator<C112030b> it = aVar.f335364d.iterator();
        while (it.hasNext()) {
            it.next().mo163749a();
        }
        aVar.notifyDataSetChanged();
        this.f335357a.invalidate();
    }
}
