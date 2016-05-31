package com.example.x24_applistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class AppReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String action = intent.getAction();
		Uri uri = intent.getData();
		if("android.intent.action.PACKAGE_ADDED".equals(action)){
			
			Toast.makeText(context, uri.toString() + "����װ��", Toast.LENGTH_SHORT).show();
			
		}else if("android.intent.action.PACKAGE_REPLACED".equals(action)){
			
			Toast.makeText(context, uri.toString() + "��������", Toast.LENGTH_SHORT).show();
			
		}else if("android.intent.action.PACKAGE_REMOVED".equals(action)){
			
			Toast.makeText(context, uri.toString() + "��ж����", Toast.LENGTH_SHORT).show();
			
		}
	}

}
