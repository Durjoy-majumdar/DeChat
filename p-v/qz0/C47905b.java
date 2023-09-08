package qz0;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C45498d;
import hz0.C46153l0;
import pz0.C47721j;

/* renamed from: qz0.b */
public class C47905b extends C6975i1<ShareCardInfo> {

    /* renamed from: o */
    public int f128522o = 0;

    /* renamed from: p */
    public C45498d f128523p;

    /* renamed from: q */
    public int f128524q = -1;

    /* renamed from: r */
    public long f128525r = 0;

    /* renamed from: s */
    public long f128526s = 0;

    public C47905b(Context context) {
        super(context, new ShareCardInfo());
        mo7997q(true);
        this.f128523p = new C47912j(context, this);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        ShareCardInfo shareCardInfo = (ShareCardInfo) obj;
        if (shareCardInfo == null) {
            shareCardInfo = new ShareCardInfo();
        }
        if (cursor.isClosed()) {
            Log.m105920e("MicroMsg.ShareCardAdatper", "cursor is closed!");
        } else {
            shareCardInfo.convertFrom(cursor);
        }
        return shareCardInfo;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f128523p.mo63834a(i, view, viewGroup, (ShareCardInfo) getItem(i));
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        Cursor cursor;
        String str;
        this.f128525r = System.currentTimeMillis();
        if (this.f128524q == -1) {
            C47721j Lx0 = C46153l0.Lx0();
            Lx0.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("select * from ShareCardInfo");
            sb.append(" where (" + "status" + "=0" + " OR " + "status" + "=5" + ")");
            sb.append(" order by ");
            sb.append("status");
            sb.append(" asc , ");
            sb.append("share_time");
            sb.append(" desc");
            cursor = Lx0.f128213d.rawQuery(sb.toString(), (String[]) null);
        } else {
            C47721j Lx02 = C46153l0.Lx0();
            int i = this.f128524q;
            Lx02.getClass();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" where ( status=0) ");
            if (i == 1) {
                sb4.append(" AND ");
                sb4.append(" (");
                sb4.append(Lx02.mo72538Lo(1));
                sb4.append(" categoryType= '10' ");
                sb4.append(") ");
            } else if (i == 2) {
                sb4.append(" AND (");
                sb4.append(" (");
                sb4.append(Lx02.mo72538Lo(1));
                sb4.append(" categoryType= '10' ");
                sb4.append(") ");
                sb4.append(" OR (");
                sb4.append(Lx02.mo72538Lo(2));
                sb4.append(" categoryType= '0' ");
                sb4.append(") ");
                sb4.append(" )");
            } else if (i != 3) {
                if (i == 4) {
                    sb4.append(" AND 1 != 1 ");
                }
                str = "";
                cursor = Lx02.f128213d.rawQuery("select * from ShareCardInfo" + sb4.toString() + str, (String[]) null);
            } else {
                sb4.append(" AND ");
                sb4.append(" (");
                sb4.append(Lx02.mo72538Lo(2));
                sb4.append(" categoryType= '0' ");
                sb4.append(") ");
            }
            str = " order by categoryType desc , itemIndex asc";
            cursor = Lx02.f128213d.rawQuery("select * from ShareCardInfo" + sb4.toString() + str, (String[]) null);
        }
        if (cursor != null) {
            this.f128522o = cursor.getCount();
            Log.m105925i("MicroMsg.ShareCardAdatper", "resetCursor showType %s, card count:%s", Integer.valueOf(this.f128524q), Integer.valueOf(this.f128522o));
        } else {
            Log.m105921e("MicroMsg.ShareCardAdatper", "resetCursor cursor is null, showType %s", Integer.valueOf(this.f128524q));
        }
        mo7998r(cursor);
        this.f128526s = System.currentTimeMillis();
        notifyDataSetChanged();
    }
}
