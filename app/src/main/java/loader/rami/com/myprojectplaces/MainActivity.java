package loader.rami.com.myprojectplaces;


import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentTransaction ft = getFragmentManager().beginTransaction();
        FragmentSerch frtSerch = new FragmentSerch();
        ft.replace(R.id.fragCont,frtSerch, "detailFragment");
        ft.commit();
    }

    public void changeFrags() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();

        //android.R.animator
        ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_out_right);

        FragmentMap fragmentMap = new FragmentMap();

        ft.replace(R.id.fragCont, fragmentMap, "detailFragment");
        ft.addToBackStack("replace");


        ft.commit();


    }


}
