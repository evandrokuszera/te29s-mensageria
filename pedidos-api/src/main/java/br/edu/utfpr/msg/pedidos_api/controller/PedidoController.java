package br.edu.utfpr.msg.pedidos_api.controller;

import br.edu.utfpr.msg.pedidos_api.dto.PedidoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @PostMapping
    public String createPedido(@RequestBody PedidoDTO pedidoDTO){
        return "Pedido criado com sucesso, aguardando confirmação de pagamento.";
    }

}
