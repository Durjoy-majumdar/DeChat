package de3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fw0.C75804d;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11174c0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76912y0;
import p910lj.C76701a;
import qo3.C77407n;
import tc0.C77885p;
import te3.C49630gz2;
import te3.C50527nd3;
import te3.C50665od3;

/* renamed from: de3.v */
public class C7304v {

    /* renamed from: a */
    public static String f25404a;

    /* renamed from: de3.v$a */
    public class C7305a implements C76879j.C11180n {

        /* renamed from: a */
        public final /* synthetic */ DialogInterface.OnDismissListener f25405a;

        /* renamed from: b */
        public final /* synthetic */ String f25406b;

        /* renamed from: c */
        public final /* synthetic */ Context f25407c;

        public C7305a(DialogInterface.OnDismissListener onDismissListener, String str, Context context) {
            this.f25405a = onDismissListener;
            this.f25406b = str;
            this.f25407c = context;
        }

        /* renamed from: j */
        public void mo782j(int i) {
            DialogInterface.OnDismissListener onDismissListener = this.f25405a;
            if (onDismissListener != null) {
                onDismissListener.onDismiss((DialogInterface) null);
            }
            String replace = this.f25406b.replace(" ", "").replace("#", "@");
            if (i == 0) {
                Context context = this.f25407c;
                Intent intent = new Intent();
                intent.putExtra("composeType", 4);
                String substring = replace.substring(0, replace.indexOf(64));
                intent.putExtra("toList", new String[]{substring + " " + replace});
                C88144b.m109791i(context, "qqmail", ".ui.ComposeUI", intent, (Bundle) null);
            } else if (i == 1) {
                C7304v.m7457a(this.f25407c, replace);
            }
        }
    }

    /* renamed from: de3.v$b */
    public class C7306b implements C76879j.C11180n {

        /* renamed from: a */
        public final /* synthetic */ DialogInterface.OnDismissListener f25408a;

        /* renamed from: b */
        public final /* synthetic */ String f25409b;

        /* renamed from: c */
        public final /* synthetic */ Context f25410c;

        public C7306b(DialogInterface.OnDismissListener onDismissListener, String str, Context context) {
            this.f25408a = onDismissListener;
            this.f25409b = str;
            this.f25410c = context;
        }

        /* renamed from: j */
        public void mo782j(int i) {
            DialogInterface.OnDismissListener onDismissListener = this.f25408a;
            if (onDismissListener != null) {
                onDismissListener.onDismiss((DialogInterface) null);
            }
            String replace = this.f25409b.replace(" ", "").replace("#", "@");
            if (i == 0) {
                C7304v.m7457a(this.f25410c, replace);
            }
        }
    }

    /* renamed from: de3.v$c */
    public class C7307c implements C7313f.C7315b {

        /* renamed from: a */
        public final /* synthetic */ C11174c0 f25411a;

        /* renamed from: b */
        public final /* synthetic */ DialogInterface.OnDismissListener f25412b;

        public C7307c(C11174c0 c0Var, DialogInterface.OnDismissListener onDismissListener) {
            this.f25411a = c0Var;
            this.f25412b = onDismissListener;
        }
    }

    /* renamed from: de3.v$d */
    public class C7308d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnDismissListener f25413d;

        public C7308d(DialogInterface.OnDismissListener onDismissListener) {
            this.f25413d = onDismissListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = this.f25413d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss((DialogInterface) null);
            }
        }
    }

    /* renamed from: de3.v$e */
    public class C7309e implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f25414d;

        /* renamed from: e */
        public final /* synthetic */ List f25415e;

        /* renamed from: f */
        public final /* synthetic */ Context f25416f;

        /* renamed from: g */
        public final /* synthetic */ C11174c0 f25417g;

        /* renamed from: h */
        public final /* synthetic */ DialogInterface.OnDismissListener f25418h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f25419i;

        /* renamed from: de3.v$e$a */
        public class C7310a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ String[] f25420d;

            public C7310a(C7309e eVar, String[] strArr) {
                this.f25420d = strArr;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                int i = 0;
                while (true) {
                    String[] strArr = this.f25420d;
                    if (i < strArr.length) {
                        e0Var.mo107142f(i, strArr[i]);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: de3.v$e$b */
        public class C7311b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f25421d;

            public C7311b(String str) {
                this.f25421d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                DialogInterface.OnDismissListener onDismissListener = C7309e.this.f25418h;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss((DialogInterface) null);
                }
                int itemId = menuItem.getItemId();
                if (itemId != 0) {
                    if (itemId == 1) {
                        C7304v.m7458b(C7309e.this.f25416f, this.f25421d);
                        C115669n.INSTANCE.kvStat(10114, "1");
                    }
                } else if (C7304v.m7459c()) {
                    Context context = C7309e.this.f25416f;
                    String str = this.f25421d;
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setType("vnd.android.cursor.dir/contact");
                    intent.putExtra("phone", str);
                    try {
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e, "", new Object[0]);
                    }
                    C115669n.INSTANCE.kvStat(10113, "1");
                } else {
                    C7304v.m7458b(C7309e.this.f25416f, this.f25421d);
                    C115669n.INSTANCE.kvStat(10114, "1");
                }
            }
        }

        /* renamed from: de3.v$e$c */
        public class C7312c implements C77407n.C47880p {
            public C7312c() {
            }

            public void onDismiss() {
                DialogInterface.OnDismissListener onDismissListener = C7309e.this.f25418h;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss((DialogInterface) null);
                }
            }
        }

        public C7309e(String str, List list, Context context, C11174c0 c0Var, DialogInterface.OnDismissListener onDismissListener, int i, Bundle bundle) {
            this.f25414d = str;
            this.f25415e = list;
            this.f25416f = context;
            this.f25417g = c0Var;
            this.f25418h = onDismissListener;
            this.f25419i = bundle;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            String replace = this.f25414d.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
            String replaceAll = replace.replaceAll("#", "%23");
            String str = (String) this.f25415e.get(i);
            Log.m105924i("MicroMsg.MailPhoneMenuHelper", str);
            boolean z = true;
            if (this.f25416f.getString(C0966R.string.bai).equals(str)) {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + replaceAll));
                intent.addFlags(268435456);
                boolean isIntentAvailable = Util.isIntentAvailable(this.f25416f, intent, true, true);
                Log.m105925i("MicroMsg.MailPhoneMenuHelper", "isIntentAvailable:%s", Boolean.valueOf(isIntentAvailable));
                if (isIntentAvailable) {
                    try {
                        Context context = this.f25416f;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$7", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$7", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e, "", new Object[0]);
                    }
                }
                C115669n.INSTANCE.kvStat(10112, "1");
                this.f25417g.dismiss();
                DialogInterface.OnDismissListener onDismissListener = this.f25418h;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss((DialogInterface) null);
                }
            } else if (this.f25416f.getString(C0966R.string.baj).equals(str)) {
                C115669n.INSTANCE.mo160131h(12059, 0, 0, 0, 0, 0);
                Intent intent2 = new Intent();
                intent2.putExtra("IPCallTalkUI_phoneNumber", replace);
                C88144b.m109791i(this.f25416f, "ipcall", ".ui.IPCallDialUI", intent2, (Bundle) null);
                this.f25417g.dismiss();
                DialogInterface.OnDismissListener onDismissListener2 = this.f25418h;
                if (onDismissListener2 != null) {
                    onDismissListener2.onDismiss((DialogInterface) null);
                }
            } else if (this.f25416f.getString(C0966R.string.baa).equals(str)) {
                String[] stringArray = (!C7304v.m7459c() || !Util.isIntentAvailable(MMApplicationContext.getContext(), new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), false)) ? C7304v.m7459c() ? new String[]{this.f25416f.getResources().getString(C0966R.string.ba_)} : new String[]{this.f25416f.getResources().getString(C0966R.string.bah)} : this.f25416f.getResources().getStringArray(C0966R.array.f2588a8);
                this.f25416f.getResources().getString(C0966R.string.bag);
                Context context2 = this.f25416f;
                LayoutInflater.from(context2);
                C77407n nVar = new C77407n(context2, 1, false);
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                C7310a aVar2 = new C7310a(this, stringArray);
                C7311b bVar = new C7311b(replace);
                C7312c cVar = new C7312c();
                nVar.f225761d = cVar;
                this.f25417g.dismiss();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                    f0Var.f224728w = null;
                    f0Var.f224729x = null;
                }
                arrayList2.clear();
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (true) {
                    String[] strArr = aVar2.f25420d;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    String str2 = strArr[i2];
                    C76875f0 f0Var2 = new C76875f0(context2, i2, 0);
                    f0Var2.f224717i = str2;
                    arrayList3.add(f0Var2);
                    i2++;
                }
                if (arrayList3.size() != 0) {
                    z = false;
                }
                if (z) {
                    Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    nVar.f225771i = aVar2;
                    nVar.f225782p = bVar;
                    nVar.f225761d = cVar;
                    nVar.f225725D = null;
                    nVar.mo107573q();
                }
            } else if (this.f25416f.getString(C0966R.string.bac).equals(str)) {
                ClipboardHelper.setText(this.f25416f, replace, replace);
                C115669n.INSTANCE.kvStat(10115, "1");
                DialogInterface.OnDismissListener onDismissListener3 = this.f25418h;
                if (onDismissListener3 != null) {
                    onDismissListener3.onDismiss((DialogInterface) null);
                }
                this.f25417g.dismiss();
                Context context3 = this.f25416f;
                C76701a.makeText(context3, (CharSequence) context3.getString(C0966R.string.f7938wv), 1).show();
            } else if (this.f25416f.getString(C0966R.string.bae).equals(str)) {
                Log.m105918d("MicroMsg.MailPhoneMenuHelper", "hy: button should consume this action");
            } else if (C7304v.f25404a.equals(str)) {
                Activity activity = (Activity) this.f25416f;
                String str3 = this.f25414d;
                Bundle bundle = this.f25419i;
                Class cls = C75700k0.class;
                String nullAsNil = Util.nullAsNil(bundle.getString("Contact_User"));
                if (nullAsNil == null) {
                    Log.m105920e("MicroMsg.MailPhoneMenuHelper", "username is null");
                } else {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(nullAsNil);
                    if (z1Var == null) {
                        Log.m105920e("MicroMsg.MailPhoneMenuHelper", "contact is null");
                    } else {
                        String string = bundle.getString("Contact_Mobile_MD5");
                        String str4 = z1Var.f149525Y0;
                        int i3 = (Util.isNullOrNil(string) || string == str3 || z1Var.mo62922p3()) ? 0 : 1;
                        ArrayList arrayList4 = new ArrayList();
                        if (!Util.isNullOrNil(str4)) {
                            String[] d = C1233a.m1357d(z1Var, str4);
                            if (d != null) {
                                for (String add : d) {
                                    arrayList4.add(add);
                                }
                            }
                            if (arrayList4.contains(str3)) {
                                arrayList4.remove(str3);
                            }
                        }
                        arrayList4.add(str3);
                        if (arrayList4.size() + i3 <= 5) {
                            C49630gz2 gz22 = new C49630gz2();
                            gz22.f134369d = nullAsNil;
                            C50665od3 od32 = new C50665od3();
                            od32.f139099e = new LinkedList<>();
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                String str5 = (String) it4.next();
                                if (C75804d.m91049c(str5)) {
                                    C50527nd3 nd32 = new C50527nd3();
                                    nd32.f138544d = str5;
                                    od32.f139099e.add(nd32);
                                    arrayList5.add(str5);
                                }
                            }
                            od32.f139098d = arrayList5.size();
                            gz22.f134370e = od32;
                            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(60, gz22));
                            if (((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                                z1Var.mo62891a4(C1233a.m1354a(arrayList4));
                                z1Var.f149534e1 = 1;
                                z1Var.f149550u = true;
                                ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(z1Var);
                            }
                            C76701a.makeText((Context) activity, (CharSequence) activity.getString(C0966R.string.f361423js2), 0).show();
                            C115669n.INSTANCE.mo160131h(12040, z1Var.getUsername(), 4, Integer.valueOf(i3), Integer.valueOf(arrayList4.size() + i3));
                        } else {
                            C76701a.makeText((Context) activity, (CharSequence) activity.getString(C0966R.string.f361049gw0), 0).show();
                        }
                    }
                }
                this.f25417g.dismiss();
                DialogInterface.OnDismissListener onDismissListener4 = this.f25418h;
                if (onDismissListener4 != null) {
                    onDismissListener4.onDismiss((DialogInterface) null);
                }
            } else {
                Log.m105920e("MicroMsg.MailPhoneMenuHelper", "hy: error phone item clicked. should not happen");
                this.f25417g.dismiss();
                DialogInterface.OnDismissListener onDismissListener5 = this.f25418h;
                if (onDismissListener5 != null) {
                    onDismissListener5.onDismiss((DialogInterface) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: de3.v$f */
    public static class C7313f extends BaseAdapter {

        /* renamed from: d */
        public List<String> f25424d = null;

        /* renamed from: e */
        public Context f25425e = null;

        /* renamed from: f */
        public Bundle f25426f = null;

        /* renamed from: g */
        public C7315b f25427g = null;

        /* renamed from: de3.v$f$a */
        public class C7314a implements View.OnClickListener {
            public C7314a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$PhoneAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!PlatformComm.C2Java.isNetworkConnected()) {
                    Log.m105928w("MicroMsg.MailPhoneMenuHelper", "hy: no network. abort download");
                    Context context = C7313f.this.f25425e;
                    C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.f360087a11), 0).show();
                    C7315b bVar = C7313f.this.f25427g;
                } else {
                    C7313f fVar = C7313f.this;
                    C7303e0.m7456a(fVar.f25425e, fVar.f25426f);
                    C7315b bVar2 = C7313f.this.f25427g;
                    if (bVar2 != null) {
                        C7307c cVar = (C7307c) bVar2;
                        cVar.f25411a.dismiss();
                        DialogInterface.OnDismissListener onDismissListener = cVar.f25412b;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss((DialogInterface) null);
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$PhoneAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: de3.v$f$b */
        public interface C7315b {
        }

        /* renamed from: de3.v$f$c */
        public class C7316c {

            /* renamed from: a */
            public TextView f25429a;

            /* renamed from: b */
            public Button f25430b;

            /* renamed from: c */
            public TextView f25431c;

            public C7316c(C7313f fVar, C7305a aVar) {
            }
        }

        /* renamed from: de3.v$f$d */
        public class C7317d {

            /* renamed from: a */
            public TextView f25432a;

            public C7317d(C7313f fVar, C7305a aVar) {
            }
        }

        public C7313f(List<String> list, Context context, DialogInterface.OnDismissListener onDismissListener, Bundle bundle) {
            Assert.assertTrue(context != null);
            this.f25424d = list;
            this.f25425e = context;
            this.f25426f = bundle;
        }

        public int getCount() {
            List<String> list = this.f25424d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f25424d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return this.f25425e.getString(C0966R.string.bae).equals(this.f25424d.get(i)) ? 1 : 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: de3.v$f$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
            /*
                r7 = this;
                java.lang.Class<ny.h> r0 = p629ny.C76979h.class
                java.lang.Object r1 = r7.getItem(r8)
                java.lang.String r1 = (java.lang.String) r1
                int r8 = r7.getItemViewType(r8)
                r2 = 1
                if (r9 != 0) goto L_0x0063
                android.content.Context r9 = r7.f25425e
                java.lang.String r3 = "layout_inflater"
                java.lang.Object r9 = r9.getSystemService(r3)
                android.view.LayoutInflater r9 = (android.view.LayoutInflater) r9
                r3 = 2131315360(0x7f094aa0, float:1.8249171E38)
                r4 = 0
                r5 = 0
                if (r8 != r2) goto L_0x004b
                r6 = 2131493724(0x7f0c035c, float:1.8610936E38)
                android.view.View r9 = r9.inflate(r6, r10, r5)
                de3.v$f$c r10 = new de3.v$f$c
                r10.<init>(r7, r4)
                android.view.View r3 = r9.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r10.f25429a = r3
                r3 = 2131301156(0x7f091324, float:1.8220362E38)
                android.view.View r3 = r9.findViewById(r3)
                android.widget.Button r3 = (android.widget.Button) r3
                r10.f25430b = r3
                r3 = 2131315300(0x7f094a64, float:1.824905E38)
                android.view.View r3 = r9.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r10.f25431c = r3
                goto L_0x005f
            L_0x004b:
                r6 = 2131493725(0x7f0c035d, float:1.8610938E38)
                android.view.View r9 = r9.inflate(r6, r10, r5)
                de3.v$f$d r10 = new de3.v$f$d
                r10.<init>(r7, r4)
                android.view.View r3 = r9.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r10.f25432a = r3
            L_0x005f:
                r9.setTag(r10)
                goto L_0x0067
            L_0x0063:
                java.lang.Object r10 = r9.getTag()
            L_0x0067:
                if (r8 == 0) goto L_0x00a9
                if (r8 == r2) goto L_0x0073
                java.lang.String r8 = "MicroMsg.MailPhoneMenuHelper"
                java.lang.String r10 = "hy: error tag"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r10)
                goto L_0x00c6
            L_0x0073:
                de3.v$f$c r10 = (de3.C7304v.C7313f.C7316c) r10
                android.widget.TextView r8 = r10.f25429a
                di3.d r0 = di3.C86312j.m106911c(r0)
                ny.h r0 = (p629ny.C76979h) r0
                android.content.Context r2 = r7.f25425e
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                android.widget.TextView r3 = r10.f25429a
                float r3 = r3.getTextSize()
                android.text.SpannableString r0 = r0.yp0(r2, r1, r3)
                r8.setText(r0)
                android.widget.TextView r8 = r10.f25431c
                android.content.Context r0 = r7.f25425e
                r1 = 2131823614(0x7f110bfe, float:1.9280033E38)
                java.lang.String r0 = r0.getString(r1)
                r8.setText(r0)
                android.widget.Button r8 = r10.f25430b
                de3.v$f$a r10 = new de3.v$f$a
                r10.<init>()
                r8.setOnClickListener(r10)
                goto L_0x00c6
            L_0x00a9:
                de3.v$f$d r10 = (de3.C7304v.C7313f.C7317d) r10
                android.widget.TextView r8 = r10.f25432a
                di3.d r0 = di3.C86312j.m106911c(r0)
                ny.h r0 = (p629ny.C76979h) r0
                android.content.Context r2 = r7.f25425e
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                android.widget.TextView r10 = r10.f25432a
                float r10 = r10.getTextSize()
                android.text.SpannableString r10 = r0.yp0(r2, r1, r10)
                r8.setText(r10)
            L_0x00c6:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: de3.C7304v.C7313f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    /* renamed from: a */
    public static void m7457a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        if (Util.isIntentAvailable(context, intent, true)) {
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "emailByDefault", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "emailByDefault", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (ActivityNotFoundException e) {
                Log.m105920e("MicroMsg.MailPhoneMenuHelper", "ActivityNotFoundException:" + e);
                C76879j.m92742m(context, C0966R.string.ba6, C0966R.string.a3h, new C7320y());
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e2, "", new Object[0]);
            }
        } else {
            C76879j.m92742m(context, C0966R.string.ba6, C0966R.string.a3h, new C7321z());
        }
    }

    /* renamed from: b */
    public static void m7458b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/person");
        intent.putExtra("phone", str);
        if (Util.isIntentAvailable(context, intent, false)) {
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MailPhoneMenuHelper", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public static boolean m7459c() {
        Context context = MMApplicationContext.getContext();
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", "10086");
        return Util.isIntentAvailable(context, intent, false);
    }

    /* renamed from: d */
    public static void m7460d(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
        if ((C75592q0.m90785o() & 1) == 0) {
            C76879j.m92736g(context, str, context.getResources().getStringArray(C0966R.array.f2573g), "", new C7305a(onDismissListener, str, context));
        } else {
            C76879j.m92736g(context, str, new String[]{context.getResources().getString(C0966R.string.b7j)}, "", new C7306b(onDismissListener, str, context));
        }
    }

    /* renamed from: e */
    public static void m7461e(Context context, String str, DialogInterface.OnDismissListener onDismissListener, Bundle bundle) {
        ArrayList<String> arrayList;
        String[] strArr;
        Context context2 = context;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        Bundle bundle2 = bundle;
        if (!(context2 instanceof Activity)) {
            Log.m105929w("MicroMsg.MailPhoneMenuHelper", "context should be Activity, %s", Util.getStack());
        }
        boolean booleanValue = C86709a0.m107523b().mo121114l() ? ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, Boolean.FALSE)).booleanValue() : false;
        int i = bundle2 != null ? bundle2.getInt("fromScene") : 0;
        if (m7459c() || Util.isIntentAvailable(MMApplicationContext.getContext(), new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), false)) {
            String nullAsNil = Util.nullAsNil(bundle2 == null ? "" : bundle2.getString("Contact_User"));
            if (nullAsNil == null || nullAsNil == "" || C75592q0.m90764L(nullAsNil) || C72996z1.m85843n5(nullAsNil)) {
                strArr = booleanValue ? new String[]{context.getResources().getString(C0966R.string.bai), context.getResources().getString(C0966R.string.baj), context.getResources().getString(C0966R.string.bac), context.getResources().getString(C0966R.string.baa)} : new String[]{context.getResources().getString(C0966R.string.bai), context.getResources().getString(C0966R.string.bac), context.getResources().getString(C0966R.string.baa)};
            } else {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nullAsNil);
                if (z1Var != null) {
                    f25404a = context.getResources().getString(C0966R.string.bab, new Object[]{z1Var.mo62898f()});
                    strArr = booleanValue ? new String[]{context.getResources().getString(C0966R.string.bai), context.getResources().getString(C0966R.string.baj), f25404a, context.getResources().getString(C0966R.string.bac), context.getResources().getString(C0966R.string.baa)} : new String[]{context.getResources().getString(C0966R.string.bai), f25404a, context.getResources().getString(C0966R.string.bac), context.getResources().getString(C0966R.string.baa)};
                } else {
                    return;
                }
            }
            arrayList = Util.stringsToList(strArr);
        } else {
            arrayList = Util.stringsToList(new String[]{context.getResources().getString(C0966R.string.bai), context.getResources().getString(C0966R.string.bac)});
        }
        ArrayList<String> arrayList2 = arrayList;
        C115669n.INSTANCE.mo160131h(11621, Integer.valueOf(i), 2);
        C11174c0 c0Var = new C11174c0(context2);
        String str2 = str;
        c0Var.setTitle(str2);
        C7313f fVar = new C7313f(arrayList2, context2, onDismissListener2, bundle2);
        fVar.f25427g = new C7307c(c0Var, onDismissListener2);
        c0Var.f32976f = fVar;
        C76879j.m92730a(context2, c0Var);
        c0Var.setOnCancelListener(new C7308d(onDismissListener2));
        c0Var.f32979i = new C7309e(str2, arrayList2, context, c0Var, onDismissListener, i, bundle);
        c0Var.show();
    }
}
