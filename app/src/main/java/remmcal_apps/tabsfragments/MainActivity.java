package remmcal_apps.tabsfragments;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);  // el enlace de la clase java con xml
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");     //identificador del tab, aqui defino el nombre
        spec.setContent(R.id.tab1);         //el enlace al tab1
        spec.setIndicator("",
                res.getDrawable(android.R.drawable.ic_btn_speak_now));    //spec.setIndicator("(Aqui el nombre del tab que aparecerá en la app)", en caso de que el nombre esté vacío se puede poner un icono, imagen );
        tabs.addTab(spec);  //aqui añado la pestaña

        spec=tabs.newTabSpec("mitab2");          //identificador del tab, aqui defino el nombre
        spec.setContent(R.id.tab2);         //el enlace al tab2
        spec.setIndicator("",
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec); //aqui añado la pestaña

        spec=tabs.newTabSpec("mitab3");          //identificador del tab, aqui defino el nombre
        spec.setContent(R.id.tab3);         //el enlace al tab2
        spec.setIndicator("TAB3",
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec); //aqui añado la pestaña

        tabs.setCurrentTab(1);

    }
}
