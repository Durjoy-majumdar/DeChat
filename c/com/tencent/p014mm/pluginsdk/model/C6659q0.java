package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import p179jw.C9531b;

/* renamed from: com.tencent.mm.pluginsdk.model.q0 */
public class C6659q0 extends AsyncTask<Void, Void, Cursor> {

    /* renamed from: a */
    public final /* synthetic */ Context f23980a;

    /* renamed from: b */
    public final /* synthetic */ String[] f23981b;

    /* renamed from: c */
    public final /* synthetic */ C9531b.C9532a f23982c;

    public C6659q0(Context context, String[] strArr, C9531b.C9532a aVar) {
        this.f23980a = context;
        this.f23981b = strArr;
        this.f23982c = aVar;
    }

    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.f23980a.getContentResolver().query(Uri.parse(C6660r0.f23983a), (String[]) null, (String) null, this.f23981b, (String) null);
    }

    public void onPostExecute(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null || cursor.getCount() <= 0) {
            ArrayList arrayList = new ArrayList();
            for (String c1Var : this.f23981b) {
                arrayList.add(new C6653c1(-1, c1Var, "", "", "", 10237));
            }
            this.f23982c.mo5537g2(arrayList);
        } else {
            cursor.moveToFirst();
            ArrayList arrayList2 = new ArrayList();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList2.add(new C6653c1(cursor.getInt(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("product_id")), cursor.getString(cursor.getColumnIndex("full_price")), cursor.getString(cursor.getColumnIndex("price_currency")), cursor.getString(cursor.getColumnIndex("price_amount")), cursor.getInt(cursor.getColumnIndex("product_state"))));
                cursor.moveToNext();
            }
            cursor.close();
            this.f23982c.mo5537g2(arrayList2);
        }
        super.onPostExecute(cursor);
    }
}
