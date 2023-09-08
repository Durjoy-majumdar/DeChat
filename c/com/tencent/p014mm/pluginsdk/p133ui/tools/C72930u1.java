package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.u1 */
public class C72930u1 {

    /* renamed from: a */
    public String f212553a;

    /* renamed from: b */
    public int f212554b = 0;

    /* renamed from: c */
    public Context f212555c;

    public C72930u1(Context context, Uri uri) {
        this.f212555c = context;
        if (uri == null) {
            Log.m105920e("MicroMsg.UriFileHelper", "initFileTypeAndPath uri == null");
        } else if (context == null) {
            Log.m105920e("MicroMsg.UriFileHelper", "initFileTypeAndPath context == null");
        } else {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String type = this.f212555c.getContentResolver().getType(uri);
            if (type != null && type.length() > 0) {
                Context context2 = this.f212555c;
                String str = null;
                if (context2 == null) {
                    Log.m105920e("MicroMsg.UriFileHelper", "getFilePath context == null");
                } else {
                    Cursor query = context2.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
                    if (query == null) {
                        Log.m105920e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor is null");
                    } else if (query.getCount() <= 0 || !query.moveToFirst()) {
                        query.close();
                        Log.m105920e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
                    } else {
                        int columnIndex = query.getColumnIndex("_data");
                        if (columnIndex == -1) {
                            query.close();
                            Log.m105920e("MicroMsg.UriFileHelper", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
                        } else {
                            str = query.getString(columnIndex);
                            query.close();
                        }
                    }
                }
                this.f212553a = str;
            } else if (uri.getPath() != null) {
                C86009m1 m1Var = new C86009m1(uri.getPath());
                if (!m1Var.mo119967g()) {
                    Log.m105920e("MicroMsg.UriFileHelper", "File is null");
                    this.f212554b = 0;
                    return;
                }
                String i = m1Var.mo119971i();
                this.f212553a = i;
                int lastIndexOf = i.lastIndexOf(".");
                if (lastIndexOf == -1 || lastIndexOf >= this.f212553a.length() - 1) {
                    this.f212554b = 1;
                } else {
                    type = singleton.getMimeTypeFromExtension(this.f212553a.substring(lastIndexOf + 1));
                }
            }
            if (type == null || this.f212553a == null) {
                this.f212554b = 0;
                return;
            }
            if (type.contains("image")) {
                this.f212554b = 3;
            } else if (type.contains("video")) {
                this.f212554b = 4;
            } else if (type.contains("audio")) {
                this.f212554b = 5;
            } else if (type.contains("mm_item")) {
                this.f212554b = 2;
            } else {
                this.f212554b = 1;
            }
            Log.m105919d("MicroMsg.UriFileHelper", "MimeType[%s], filePath = [%s], fileType = [%s], type = [%s], Uri[%s]", type, this.f212553a, Integer.valueOf(this.f212554b), type, uri.toString());
        }
    }
}
