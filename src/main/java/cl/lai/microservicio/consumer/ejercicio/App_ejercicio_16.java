package cl.lai.microservicio.consumer.ejercicio;

/**
 * @author chunhaulai
 *
 */
public class App_ejercicio_16 {
    public static void main( String[] args ){
    	//1. Clonar la cl.lai.microservicio.consumer.config.TallerSpringRobbinCategoriaConfiguracion con el nombre de cl.lai.microservicio.consumer.config.TallerSpringRobbinBancoConficuracion 
    	//2. Definir el @RibbonClient en el BancoController que utiliza la configuracion TallerSpringRobbinBancoConficuracion 
    	//3. Levantar AppEurekaServer del proyecto spring-taller-microservicio-eureka
    	//4. Levantar App_tutorial_15 del proyecto spring-taller-manager en puerto 2101, 2102, 2013
    	//5. Levantar cl.lai.microservicio.consumer.App_tutorial_15 del proyecto spring-taller-microservicio-consumer
    	//6. Probar el servicio RibbonClient con los distintos roles en TallerSpringRobbinBancoConficuracion, y reiniciar el servicios
    	/*
    	 * 	AvailabilityFilteringRule
    	 *  ClientConfigEnabledRoundRobinRule
    	 *  RandomRule
    	 *  RoundRobinRule
    	 *  RetryRule
    	 *  WeightedResponseTimeRule
    	 *  ZoneAvoidanceRule
    	 */
    	

    }
}
